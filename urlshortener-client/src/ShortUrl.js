import React, { useEffect } from 'react';

import { useParams } from 'react-router';

import axiosInstance from "./axios"; 

import { useHistory } from "react-router-dom";

function ShortUrl() {
    let query = useParams();

    useEffect(() => {
        console.log(`id: ${query.id}`);

        axiosInstance.get(`/url/${query.id}`)
          .then((response) => {
            console.log(response.data);
            
            window.location.href = response.data.fullUrl;
          });
    });

  return (
    <>
    ShortUrl
    </>
  );
}

export default ShortUrl;
