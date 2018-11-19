/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author CCNE
 */
public class PS implements Comparable<PS>{
     private int tuso;
    private int mauso;
//ham khoi tao
PS(int a,int b){
	this.tuso = a;
	this.mauso = b;
}
public void setTuso(int x){
	this.tuso=x;
}
public void setMauso(int x){
	this.mauso=x;
}
public int getTuso(){
	return this.tuso;
}
public int getMauso(){
	return this.mauso;
}

public int UCLN(int x,int y){
	int x1=Math.abs(x);
	int y1=Math.abs(y);
	if(x==0&&y!=0) return y1;
	if(x!=0&&y==0) return x1;
	
	while(x1!=y1){
		if(x1>y1) x1=x1-y1;
		else y1=y1-x1;
	}
	return x1;
}
//ham toi gian phan so
public void simplify(){
	int x= UCLN(this.tuso,this.mauso);
	this.tuso/=x;
	this.mauso/=x;
            if(this.mauso<0){
                this.tuso  = -this.tuso;
                this.mauso = -this.mauso;
            }
}

public PS congPS(PS ps){
	PS ps1=new PS(this.tuso*ps.mauso+this.mauso*ps.tuso,this.mauso*ps.mauso);
	ps1.simplify();
	return ps1;
}
public PS truPS(PS ps){
	PS ps1=new PS(this.tuso*ps.mauso-this.mauso*ps.tuso,this.mauso*ps.mauso);
	ps1.simplify();
	return ps1;
}
public PS nhanPS(PS ps){
	PS ps1=new PS(this.tuso*ps.tuso,this.mauso*ps.mauso);
	ps1.simplify();
	return ps1;
}
public PS chiaPS(PS ps){
	PS ps1=new PS(this.tuso*ps.mauso,this.mauso*ps.tuso);
	ps1.simplify();
	return ps1;
}
//phuong thuc so sanh 2 phan so
public boolean equals(PS ps){
	this.simplify();
	ps.simplify();
	return (this.tuso==ps.tuso && this.mauso==ps.mauso);	
}

    @Override
    public int compareTo(PS o) {
        if(this.tuso*o.mauso - this.mauso*o.tuso<0) return -1;
        else if(this.tuso*o.mauso - this.mauso*o.tuso>0) return 1;
        return 0;
    }
}
