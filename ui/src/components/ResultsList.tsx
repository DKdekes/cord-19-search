import * as React from 'react';
import * as InfiniteScroll from 'react-infinite-scroll-component';
import { nextPage } from '../actions/index';
import { Result } from './Result';

interface IResultsListProps {
  results: any[];
}

export const ResultsList = ({ results}: IResultsListProps): JSX.Element => {
  const ResultsArray = [];
  const len = results.length;
  for (let i = 0; i < len; i++) {
    ResultsArray.push(<Result key={results[i].paper_id} data={results[i]} />);
  }

  return (
    <InfiniteScroll
      dataLength={len}
      next={nextPage}
      hasMore={true}
      loader={<p className="loading-text">Loading...</p>}
    >
      {ResultsArray}
    </InfiniteScroll>
  );
};
