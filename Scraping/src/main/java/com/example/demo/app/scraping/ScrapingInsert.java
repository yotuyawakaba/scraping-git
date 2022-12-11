package com.example.demo.app.scraping;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Proposition;
import com.example.demo.service.ScrapingService;

@Service
public class ScrapingInsert {

	private final ScrapingService scrapingService;

	static ArrayList<ArrayList<String>> prop2 = new ArrayList<ArrayList<String>>();
	ArrayList<String> propTitle = new ArrayList<String>();
	ArrayList<String> propFee = new ArrayList<String>();
	ArrayList<String> propPlace = new ArrayList<String>();
	ArrayList<String> propOutline = new ArrayList<String>();
	ArrayList<String> propSource_of_information = new ArrayList<String>();
	ArrayList<String> propUrl = new ArrayList<String>();

	public ScrapingInsert(ScrapingService scrapingService) {
		this.scrapingService = scrapingService;
	}

	// 案件を登録する
	public void propositionRegister() throws IOException {

		Document document = Jsoup.connect("https://freelance-start.com/jobs?skill=1&prefecture=13").get();

		// title取得
		Elements titles = document.select("span.fs-16.font-weight-bold");

		// titleを格納
		for (Element title : titles) {
			String titleName = title.text();
			propTitle.add(titleName);
		}

		// 単価を取得
		Elements fees = document.select("div.col.justify-content-start.d-flex");

		// 単価を格納
		int feeCount = 1;
		for (Element fee : fees) {
			String feeName = fee.text();
			if (feeCount == 1 || feeCount % 3 == 1) {
				propFee.add(feeName);
			}
			feeCount++;
		}
		
		
//		for (Element fee : fees) {
//			String feeTotal = fee.text();
//			propFee.add(feeTotal);
//		}

		// 勤務場所を取得
		Elements places = document.select("div.col.justify-content-start.d-flex");

		// 勤務場所を格納
		int placeCount = 1;
		for (Element place : places) {
			String placeName = place.text();
			if (placeCount % 3 == 0) {
				propPlace.add(placeName);
			}
			placeCount++;
		}

		// 概要を取得
		Elements outlines = document.select("p.text-break-all.fs-14");

		// 概要を格納
		for (Element outline : outlines) {
			String outlineName = outline.text();
			propOutline.add(outlineName);
		}

		// 情報提供元を取得
		Elements source_of_informations = document.select("p.fs-10.text-secondary");

		// 情報提供元を格納
		int sourceCount = 0;
		for (Element source_of_information : source_of_informations) {
			String source_of_informationName = source_of_information.text();
			if (sourceCount % 2 == 0) {
				propSource_of_information.add(source_of_informationName);
			}
			sourceCount++;
		}

		// URLを取得
		Elements urls = document
				.select("div.card.job-top-list-card.border-light-green-gray.p-4.add-cursor.ajax-job-link");

		// URLを格納
		for (Element url : urls) {
			String urlName = url.attr("data-url");
			propUrl.add("https://freelance-start.com" + urlName);
		}

		//各案件情報の項目を格納する
		prop2.add(propTitle);
		prop2.add(propFee);
		prop2.add(propPlace);
		prop2.add(propOutline);
		prop2.add(propSource_of_information);
		prop2.add(propUrl);

		//案件情報をDBにインサートする
		for (int y = 0; y < 49; y++) {
			Proposition proposition = new Proposition();
			proposition.setTitle(prop2.get(0).get(y));
			proposition.setFee(prop2.get(1).get(y));
			proposition.setPlace(prop2.get(2).get(y));
			proposition.setOutline(prop2.get(3).get(y));
			proposition.setSource_of_information(prop2.get(4).get(y));
			proposition.setUrl(prop2.get(5).get(y));

			scrapingService.insert(proposition);

		}

	}
}
