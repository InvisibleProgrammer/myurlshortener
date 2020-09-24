package com.invisibleprogrammer.urlshortener.database;

public interface UrlRepository
{
  void storeUrl(String fullUrl, String shortUrl);
}
