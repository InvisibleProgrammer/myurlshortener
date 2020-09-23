import React, { useState } from 'react';
import axiosInstance from './axios';

function NewRandomUrl() {
    const [longUrl, setLongUrl] = useState('ddd');

  return (
    <>
        <input type="text" placeholder="Your huge URL you want to shorten" onChange={ (e) => setLongUrl(e.target.value)} />
        <input type="submit" value="Generate" onClick={generateShortUrl}/>
    </>
  );


  function generateShortUrl() {
      console.log("Generate short url called");
      console.log(`Long URL: ${longUrl}`);

      axiosInstance.post("/url", {
          url: longUrl
      })
        .then((response) => console.log(response));
  }
}

export default NewRandomUrl;
