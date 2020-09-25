package com.invisibleprogrammer.urlshortener.database;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.invisibleprogrammer.urlshortener.domain.ShortUrl;

@Repository
public class SQLUrlRepository implements UrlRepository
{
  NamedParameterJdbcTemplate template;

  public SQLUrlRepository(final NamedParameterJdbcTemplate template)
  {
    this.template = template;
  }

  @Override
  public void storeUrl(final String fullUrl, final String shortUrl)
  {
    final String sql = "insert into shortUrls(fullurl, shorturl) values (:fullUrl, :shortUrl);";

    KeyHolder holder = new GeneratedKeyHolder();
    SqlParameterSource param = new MapSqlParameterSource()
        .addValue("fullUrl", fullUrl)
        .addValue("shortUrl", shortUrl);
    template.update(sql,param, holder);
  }

  @Override
  public ShortUrl[] getAll()
  {
    final String sql = "select * from shortUrls;";

    var shortUrls = template.query(sql, new ShortUrlRowMapper());

    return shortUrls.toArray(new ShortUrl[shortUrls.size()]);
  }

  @Override
  public ShortUrl get(final String id)
  {
    final String sql = "select * from shortUrls where shortUrl = '" + id + "';";

    var shortUrls = template.query(sql, new ShortUrlRowMapper());

    if (shortUrls.size() == 0){
      return null;
    }

    return shortUrls.get(0);
  }
}
