package com.invisibleprogrammer.urlshortener.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.invisibleprogrammer.urlshortener.domain.ShortUrl;

public class ShortUrlRowMapper implements RowMapper<ShortUrl>
{

  @Override
  public ShortUrl mapRow(final ResultSet rs, final int rowNum) throws SQLException
  {
    String fullUrl = rs.getString("fullUrl");
    String shortUrl = rs.getString("shortUrl");

    return new ShortUrl(fullUrl, shortUrl);
  }
}
