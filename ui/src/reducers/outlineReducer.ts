import { IAction } from '.';

export const outlineReducer = (state = '', action: IAction) => {
  switch (action.type) {
    case 'OUTLINE':
      console.log(action.payload)
      return action.payload;
    case 'OUTLINE_LOADING':
      return 'outline loading...';
    default:
      return state;
  }
};
