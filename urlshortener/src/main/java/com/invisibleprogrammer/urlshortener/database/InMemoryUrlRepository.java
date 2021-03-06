package com.invisibleprogrammer.urlshortener.database;

import java.util.ArrayList;
import java.util.List;

import com.invisibleprogrammer.urlshortener.domain.ShortUrl;

public class InMemoryUrlRepository implements UrlRepository
{
  private List<ShortUrl> shortUrls;

  public InMemoryUrlRepository()
  {
    shortUrls = new ArrayList<>();
  }

  @Override
  public void storeUrl(String fullUrl, String shortUrl)
  {
    ShortUrl newShortUrl = new ShortUrl(fullUrl, shortUrl);
    shortUrls.add(newShortUrl);
  }

  @Override
  public ShortUrl[] getAll()
  {
    return shortUrls.toArray(new ShortUrl[shortUrls.size()]);
  }

  @Override
  public ShortUrl get(final String id)
  {
    return null;
  }
}
