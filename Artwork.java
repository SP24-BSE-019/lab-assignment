public class Artwork{

   private String title;
   private int year;
   private Artist Artist;

   Artwork1(String title, int year, Artist a){
   this.title=title;
   this.year=year;
   this.artist=a;
}

Artwork2(String title, int year){
   this.title=title;
   this.year=year;

}

public void setTitle(){
   this title=title;
}

public String getTitle(){
   return title;
}

public void setYear(){
   this year=year;
}

public int getYear(){
return year;
}

public void setArtist(){
 this Artist=Artist;
}

public Artist setArtist(){
this Artit=Artist;
}

public Artist getArtist(){
return Artist;
}

System.out.println("Title is:"+ title);
System.out.println("Year is:"+year);
System.out.println("Artist for this art is :"+ Artist);
}
