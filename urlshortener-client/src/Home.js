import React, { useState, useEffect } from "react";

import NewRandomUrl from "./NewRandomUrl";
import MostRecentRandomUrls from "./MostRecentRandomUrls";

import axiosInstance from "./axios";

function Home() {
  const [shortUrls, setShortUrls] = useState([]);

  useEffect(() => {
    refreshData();
  }, []);

  function refreshData() {
    axiosInstance.get("/url").then((response) => {
      console.log(response);
      setShortUrls(response.data);
    });
  }

  return (
    <>
      <NewRandomUrl onNew={onNewShortUrl} />
      <MostRecentRandomUrls urls={shortUrls} />
    </>
  );

  function onNewShortUrl() {
    console.log("New short url event");
    refreshData();
  }
}

export default Home;
