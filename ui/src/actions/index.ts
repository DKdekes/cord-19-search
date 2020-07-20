import axios from '../axiosConfig';
import { store } from '../reducers';

export const setQuery = (e: any): void => {
  store.dispatch({ type: 'SET_QUERY', payload: encodeURI(e.target.value) });
};

export const handleKey = (e: any, reset?: string): void => {
  if (e.key === 'Enter') {
    if (reset) {
      store.dispatch({ type: 'RESET_RESULTS' });
    }
    search();
  }
};

export const search = (reset?: any): void => {
  store.dispatch<any>((dispatch: any): any => {
    if (reset) {
      dispatch({ type: 'RESET_RESULTS' });
    }
    dispatch({ type: 'LOADING_STATUS', payload: true });
    axios
      .get(`/papers/simple/${store.getState().query}`)
      .then((res: any) => {
        dispatch({ type: 'SEND_RESULTS', payload: res.data.content })
      })
      .then(() => {
        dispatch({ type: 'LOADING_STATUS', payload: false });
      });
  });
};

export const nextPage = (): void => {
  store.dispatch<any>((dispatch: any): any => {
    dispatch({ type: 'INCREMENT' });
  });
};

export const outline = (data: any): void => {
  store.dispatch<any>((dispatch: any): any => {
      dispatch({ type: 'OUTLINE', payload: data })
  });
};
