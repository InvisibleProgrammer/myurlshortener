package com.invisibleprogrammer.urlshortener.url;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invisibleprogrammer.urlshortener.database.UrlRepository;
import com.invisibleprogrammer.urlshortener.domain.ShortUrl;

import org.apache.commons.lang3.RandomStringUtils;

@RestController
@Component
public class UrlController
{

  @Resource
  UrlRepository urlRepository;

  @GetMapping("/url")
  public ShortUrl[] getAll(){
    return urlRepository.getAll();
  }

  @GetMapping("/url/{id}")
  public ShortUrl get(@PathVariable String id){
    return urlRepository.get(id);
  }

  @PostMapping("/url")
  public void shorten(@RequestBody CreateUrlRequest url){
    System.out.println(url.getUrl());

    String shortUrl = RandomStringUtils.randomAlphabetic(10);

    System.out.println(shortUrl);

    urlRepository.storeUrl(url.getUrl(), shortUrl);
  }
}
