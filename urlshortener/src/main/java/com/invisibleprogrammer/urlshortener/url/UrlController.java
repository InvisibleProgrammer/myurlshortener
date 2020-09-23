package com.invisibleprogrammer.urlshortener.url;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController
{

  @PostMapping("/url")
  public void shorten(@RequestBody CreateUrlRequest url){
    System.out.println(url.getUrl());
  }
}
