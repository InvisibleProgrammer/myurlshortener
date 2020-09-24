package com.invisibleprogrammer.urlshortener.domain;

public final class ShortUrl
{
  private String fullUrl;
  private String shortUrl;

  public ShortUrl(final String fullUrl, final String shortUrl)
  {
    this.fullUrl = fullUrl;
    this.shortUrl = shortUrl;
  }

  public String getFullUrl()
  {
    return fullUrl;
  }

  public void setFullUrl(final String fullUrl)
  {
    this.fullUrl = fullUrl;
  }

  public String getShortUrl()
  {
    return shortUrl;
  }

  public void setShortUrl(final String shortUrl)
  {
    this.shortUrl = shortUrl;
  }
}
