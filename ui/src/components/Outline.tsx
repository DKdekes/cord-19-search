import * as React from 'react';
import '../style/Outline.css';

interface IOutlineProp {
  outline?: {
    abstract: string;
    body_text: [{
        cite_spans: [];
        section: string;
        text: string;
    }]
    metadata: {
        title: string;
    };
  };
}

export const Outline: React.StatelessComponent<IOutlineProp> = ({ outline }: IOutlineProp): JSX.Element => {
  console.log(outline)
  return (
    <div className="outline">
      <h4 className="placeholder">{!!outline ? null : 'Select paper from list.'}</h4>
      <h3>{!outline ? null : outline.metadata.title}</h3>
      {!outline ? null : outline.body_text.map(body => {
          return <p key={body.text}>{body.text}</p>
      })
    }
    </div>
  );
};
