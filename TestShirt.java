class Shirt {
private int collarsize;   //Private fields
private int sleevelength;
private String material;
 


public int getcollarsize(){  //Accessor for collarsize

return collarsize;
}

public  void setcollarsize(int collarsize){   //Mutator for collarsize
this.collarsize = collarsize;
}

public int getsleevelength(){  //Accessor for sleevelength

return sleevelength;
}
public void setsleevelength(int sleevelength){      //Mutator for sleevelength
this.sleevelength = sleevelength;

}
public String getmaterial(){       //Accessor for material
return material;
} 
public void setmaterial(String material){      //Mutator for material
this.material = material;

}
public Shirt(int collarsize,int sleevelength){  //Constructor method with arguments
this.collarsize = collarsize;
this.sleevelength =sleevelength;
this.setmaterial("cotton");
}
public Shirt(){      //Constructor method without argument
this.setcollarsize(16);
this.setsleevelength(35);
this.setmaterial("cotton");
}
}

class TestShirt{

public static void main(String args[]){

Shirt shirt1 = new Shirt();   //new object shirt1
Shirt shirt2 = new Shirt(37,85);     //new object shirt2
Shirt shirt3 = new Shirt(38,86);        //new object shirt3




// printing shirt details using set and get method
System.out.println("shirt1details :"+"\nshirt1 collar size :"+shirt1.getcollarsize()+"\nshirt1 sleevesize :"+shirt1.getsleevelength()+"\nshirt1 material :"+shirt1.getmaterial());

System.out.println("shirt2details :"+"\nshirt2 collar size :"+shirt2.getcollarsize()+"\nshirt2 sleevesize :"+shirt2.getsleevelength()+"\nshirt2 material :"+shirt2.getmaterial());

System.out.println("shirt3details :"+"\nshirt3 collar size :"+shirt3.getcollarsize()+"\nshirt3 sleevesize :"+shirt3.getsleevelength()+"\nshirt3 material :"+shirt3.getmaterial());


}
}
