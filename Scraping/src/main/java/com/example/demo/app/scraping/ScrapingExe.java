package com.example.demo.app.scraping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.example.demo.entity.Proposition;
import com.example.demo.service.ScrapingService;

public class ScrapingExe {
	
	private static ScrapingService scrapingService;
	
	static ArrayList<ArrayList<String>> prop2 = new ArrayList<ArrayList<String>>();
	
	public ScrapingExe(ScrapingService scrapingService) {
		this.scrapingService = scrapingService;
	}
	
	public void test() {
		
	}
	
//テストで使用しただけなのでここのクラスは使用しない
//	public static void main(String[] args) throws IOException {
//		
//		ArrayList<String> propTitle = new ArrayList<String>();
//		ArrayList<String> propFee = new ArrayList<String>();
//		ArrayList<String> propPlace = new ArrayList<String>();
//		ArrayList<String> propOutline = new ArrayList<String>();
//		ArrayList<String> propSource_of_information = new ArrayList<String>();
//		ArrayList<String> propUrl = new ArrayList<String>();
//		
//		List<Integer> test = new ArrayList<>();
//        Document document = Jsoup.connect("https://freelance-start.com/jobs?skill=1&prefecture=13").get();
//        
//        //title取得
//        org.jsoup.select.Elements titles = document.select(".mt-4 span.fs-16");
//        
//        //titleを格納
//        for (Element title : titles) {
//            String titleName = title.text();
//            propTitle.add(titleName);
//        }
//        
//        //単価を取得
//        org.jsoup.select.Elements fees = document.select(".col span.fs-22");
//        
//        //単価を格納
//        for (Element fee : fees) {
//            String feeTotal = fee.text();
//            propFee.add(feeTotal);
//        }
//        
//        //勤務場所を取得
//        org.jsoup.select.Elements places = document.select("div.col.justify-content-start.d-flex");
//        
//        //勤務場所を格納
//        int i = 1;
//        for (Element place : places) {
//            String placeName = place.text();
//            if(i % 3 == 0) {
//            	propPlace.add(placeName);
//            }
//            i++;
//        }
//        
//        //概要を取得
//        org.jsoup.select.Elements outlines = document.select("span.fs-16.font-weight-bold");
//        
//        //概要を格納
//        for (Element outline : outlines) {
//            String outlineName = outline.text();
//            propOutline.add(outlineName);
//        }
//        
//        //情報提供元を取得
//        org.jsoup.select.Elements source_of_informations = document.select("p.fs-10.text-secondary");
//        
//        //情報提供元を格納
//        i = 0;
//        for (Element source_of_information : source_of_informations) {
//            String source_of_informationName = source_of_information.text();
//            if (i % 2 == 0) {
//            	propSource_of_information.add(source_of_informationName);
//            }
//            i++;
//        }
//        
//        //URLを取得
//        org.jsoup.select.Elements urls = document.select("div.card.job-top-list-card.border-light-green-gray.p-4.add-cursor.ajax-job-link");
//        
//        //URLを格納
//        for (Element url : urls) {
//            String urlName = url.attr("data-url");
//            propUrl.add("https://freelance-start.com" + urlName);
//        }
//        
//        prop2.add(propTitle);
//    	prop2.add(propFee);
//    	prop2.add(propPlace);
//    	prop2.add(propOutline);
//    	prop2.add(propSource_of_information);
//    	prop2.add(propUrl);
//    	
////    	System.out.println(prop2.get(0).get(0));
////    	System.out.println(prop2.get(1).get(0));
////    	System.out.println(prop2.get(2).get(0));
////    	System.out.println(prop2.get(3).get(0));
////    	System.out.println(prop2.get(4).get(0));
////    	System.out.println(prop2.get(5).get(0));
//    	
//    	makeProp();
//    	System.out.println("test");
//        
//        
////        for (int y = 0; y < 50; y++) {
////        	Proposition proposition = new Proposition();
////            proposition.setTitle(propTitle.get(y));
////            proposition.setTitle(propFee.get(y));
////            proposition.setTitle(propPlace.get(y));
////            proposition.setTitle(propOutline.get(y));
////            proposition.setTitle(propSource_of_information.get(y));
////            proposition.setTitle(propUrl.get(y));
////        }
//        
//        
//        
//      //最終的にPropositionエンティティに入れる必要あり
//        
//        
////        Elements elements = document.select(".col nav justify-content-end d-flex pr-4 a");
////        for (Element element : elements) {
////            String name = element.text();
////            System.out.println(name);
////        }
//    }
//	
//	static void makeProp() {
//		List<Proposition> list = new ArrayList<Proposition>();
//
//		try {
//		for (int y = 0; y < 49; y++) {
//        	Proposition proposition = new Proposition();
//            proposition.setTitle(prop2.get(0).get(y));
//            proposition.setFee(prop2.get(1).get(y));
//            proposition.setPlace(prop2.get(2).get(y));
//            proposition.setOutline(prop2.get(3).get(y));
//            proposition.setSource_of_information(prop2.get(4).get(y));
//            proposition.setUrl(prop2.get(5).get(y));
//            System.out.println(proposition.getTitle());
//            System.out.println(proposition.getFee());
//            System.out.println(proposition.getPlace());
//            System.out.println(proposition.getOutline());
//            System.out.println(proposition.getSource_of_information());
//            System.out.println(proposition.getUrl());
//            list.add(proposition);
//            scrapingService.insert(proposition);
//            
//        }
//		} catch (NullPointerException e) {
//			System.out.println("null");
//		}
//	}

}
