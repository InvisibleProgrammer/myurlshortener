import React, { useEffect } from 'react';

import { useParams } from 'react-router';

function ShortUrl() {
    let query = useParams();

    useEffect(() => {
        console.log(`id: ${query.id}`);

        
    });

  return (
    <>
    ShortUrl
    </>
  );
}

export default ShortUrl;
