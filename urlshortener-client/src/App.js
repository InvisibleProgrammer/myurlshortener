import React from 'react';
import './App.css';

import LoginStatus from './user/LoginStatus';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Home from './Home';
import ShortUrl from './ShortUrl';
import SignIn from './user/SignIn';
import SignUp from './user/SignUp';

function App() {
  return (
    <BrowserRouter>
    <div>
      <nav><div>My fancy URL shortener</div><LoginStatus /></nav>

      <Switch>
        <Route path='/' exact component={Home} />
        
        <Route path='/signin' exact component={SignIn} />
        <Route path='/signup' exact component={SignUp} />
        
        <Route path='/:id' exact component={ShortUrl}/>
      </Switch>
    </div>
    </BrowserRouter>
  );
}

export default App;
