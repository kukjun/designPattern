package part2.chapter11.list5;

public interface PersonBean {

  String getName();
  String getGender();
  String getInterests();
  int getHotOrNotRating();

  void setName(String name);
  void setGender(String gender);

  void setInterests(String interests);

  void setHotOrNotRating(int rating);

  void setGeekRating(int i);

}
