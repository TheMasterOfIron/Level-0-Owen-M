public class forLoopGauntlet2 {
	public static void main(String[] args) {
for(int q=0;q<=100; q++){
	System.out.println(q);
}
for(int w=100;w>=0; w--){
	System.out.println(w);
}
for(int e=2;e<=100; e+=2){
	System.out.println(e);
}
for(int r=1;r<=99; r+=2){
	System.out.println(r);
}
for(int t=1;t<=500; t++){
	if(t%2==0){
		System.out.println(t + " even");
	}
	else{
		System.out.println(t + " odd");
	}
}
for(int y=0;y<=777; y+=7){
	System.out.println(y);
}
for(int u=2006;u<=2017; u++){
	int i = u-2006;
	System.out.println("On " + u + ", May 28th I was " + i + " years old.");
}
for (int o = 0; o <3; o++) {
	for (int p = 0; p <3; p++) {
		System.out.println(o + "" + p);
	}
}
}
}
