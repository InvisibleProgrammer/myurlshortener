package com.invisibleprogrammer.urlshortener.database;

import com.invisibleprogrammer.urlshortener.domain.ShortUrl;

public interface UrlRepository
{
  void storeUrl(String fullUrl, String shortUrl);

  ShortUrl[] getAll();

  ShortUrl get(String id);
}
