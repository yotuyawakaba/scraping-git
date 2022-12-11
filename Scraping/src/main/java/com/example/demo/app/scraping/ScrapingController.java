package com.example.demo.app.scraping;

import java.io.IOException;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Proposition;
import com.example.demo.service.ScrapingService;

/**
 * Scrapingアプリ
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ScrapingController {

	private final ScrapingService scrapingService;
	private final ScrapingInsert scrapingInsert;

	public ScrapingController(ScrapingService scrapingService, ScrapingInsert scrapingInsert) {
		this.scrapingService = scrapingService;
		this.scrapingInsert = scrapingInsert;
	}

	/**
	 * 案件の一覧を表示
	 * 
	 * @param model
	 * @return resources/templates下のHTMLファイル名
	 * @throws IOException
	 */
//	@GetMapping
//	public String scraping(Model model) throws IOException {
//
//		// ページにアクセスしたらDBに登録されているデータをすべて削除する
//		scrapingService.delete();
//
//		// ページにアクセスしたら案件情報を対象サイトから取得し、DBにインサートする
//		scrapingInsert.propositionRegister();
//
//		List<Proposition> list = scrapingService.findAll();
//
//		model.addAttribute("list", list);
//		model.addAttribute("title", "案件一覧");
//
//		return "scraping/index";
//	}

	
	@RequestMapping("/test")
	@ResponseBody
	public List<Proposition> getScraping(Model model) throws IOException {

		// ページにアクセスしたらDBに登録されているデータをすべて削除する
		scrapingService.delete();

		// ページにアクセスしたら案件情報を対象サイトから取得し、DBにインサートする
		scrapingInsert.propositionRegister();

		List<Proposition> list = scrapingService.findAll();

		return list;
	}

}
