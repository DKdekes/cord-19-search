import * as React from 'react';
import Tooltip from 'rc-tooltip';
import 'rc-tooltip/assets/bootstrap_white.css';
import '../style/Result.css';
import { outline } from '../actions';
import document from '../images/document.svg';

export const Result = ({data}: any) => (
    <div className="card">
    <div className="card-body">
      <h4 className="title">
          {data.metadata.title}
      </h4>
      <Tooltip
        placement="right"
        overlay={'Text-Only Outline'}
        arrowContent={<div className="rc-tooltip-arrow-inner" />}
      >
        <img className="icon" alt="outline" src={document} onClick={() => outline(data)} />
      </Tooltip>
      <div className="wrap">
        <p className="description">{data.body_text[0].text}</p>
      </div>
    </div>
  </div>
);
