import * as React from 'react';
import { Link } from 'react-router-dom';
import '../style/About.css';

export const About: React.StatelessComponent = (): JSX.Element => (
  <div>
    <Link to="/">
      <h3 className="home-1">CORD19</h3>
      <h3 className="home-2">Search</h3>
    </Link>
    <div className="center">
      <h4>About</h4>
      <p>
        CORD-19 Search is a metasearch engine built with Elasticsearch, Springboot, React and Redux.
      </p>
    </div>
  </div>
);
