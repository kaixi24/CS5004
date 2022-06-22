package problem3;

import problem1.List;

public interface ListofList {
  Integer size();

  Integer length();

  Integer sum();

  Boolean isEmpty();

  ListofList add (List listToAdd);

  ListofList removeInteger(int intToRemove);

  ListofList removeAllInteger(int intToRemove);

}
