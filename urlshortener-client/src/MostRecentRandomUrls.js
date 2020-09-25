import React from "react";

function MostRecentRandomUrls(props) {
  return (
    <>
      <ul>
        {props.urls.map((shortUrl) => (
          <li key={shortUrl.shortUrl}>
            <div>{shortUrl.fullUrl}</div>
            <div>{shortUrl.shortUrl}</div>
          </li>
        ))}
      </ul>
    </>
  );
}

export default MostRecentRandomUrls;
