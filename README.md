TD2 Java : Aaron Demay
Exercice 1

1)	Voici ce qu’affiche le main : <br/>
42 <br/>
42 <br/>
24 <br/>
24 <br/>
24 <br/>
24 <br/>
On remarque que « fille.meth » retourne 24 car elle a été redifinie. <br/>
On remarque également que merefille.meth() renvoie 24 car la variable est de type fille. <br/>
2)Dans Fille il peut faire appel à super.meth() et meth(). Alors que s’il est dans Main, il peut appel à une méthode meth(à <br/>
3) Si les méthode meth sont statiques, on obtient ceci :  <br/>
42 <br/>
42 <br/>
24 <br/>
42 <br/> 
42 (On obtient 42 car l’appel prend en compte le type de la variable)<br/>
42 <br/>
4) Si meth sont des champs, on obtient désormais ceci : <br/>
42 <br/>
42 <br/>
24 <br/>
42 <br/>
42 <br/>
42 <br/>
Exercice 2 <br/>

1)	On remarque que la méthode i() de fille retourne un int alors que la méthode i de Mère ne retourne rien <br/>
La méthode h() dans fille retourne un String alors que dans la méthode Mère, elle retourne un Integer <br/>
On remarque que la méthode e est de type private dans la classe Fille mais de type protected dans la classe Mère -> Cela pose problème car cela réduit la visibilité  <br/>
On remarque que miage() n’est pas définie dans la classe Mère. <br/>
K() ne renvoie pas le même type d’exception dans la classe Mère que dans la classe Fille (IOexception est dans Exception mais pas l’inverse) <br/>
merefille est dans une variable de type Mere et ne trouve donc pas la fonction miage() <br/>

3) On appelle redifinition lorsqu'on crée une sous-classe puis on lui créee une fonction avec le même nom et les mêmes arguments qu'une fonction dans la classe de base. Dans ce cas, la fonction dela sous-classe sera exécutée. <br/>
La surcharge de fonction a lieu dans une seule classe avec un même nom de fonctions mais un ensemble d'arguments différents. <br/>
Les redéfinitions sont : <br/>
a() de la classe fille redéfinit le a() de la classe mere <br/>
b() de la classe fille redéfinit le b() de la classe mere <br/>
c(Mere)  <br/>
g() de la classe fille redéfinit le g() de la classe mere <br/>
j() de la classe fille redéfinit le j() de la classe mere <br/>
l() de la classe fille redéfinit le l() de la classe mere <br/>
m() de la classe fille redéfinit le m() de la classe mere <br/>

Les surcharges sont : <br/>
D(mere) surcharge la méthode d() dans la classe fille <br/>
C(mere) surcharge la méthode  c () dans la classe mere <br/>
D(mere) surcharge la méthode d() dans la classe fille <br/>

4)Explication des affichages  <br/>
Mere mere=new Mere(); <br/> <br/>
Mere mereFille=new Fille(); <br/> 
Fille fille=new Fille(); <br/>
mere.miage();	=> miage n’esr pas définie dans la classe Mere <br/>
fille.miage(); => Appel de la méthode miage dans la classe fille <br/>
mereFille.miage(); =>comme variable est de type Mere elle n’a pas accès à la méthode miage() <br/>
((Fille)mereFille).miage(); => Merefille devient de la classe Fille grace au cast <br/>
mere.a(); => Appel de la méthode a() dans la classe Mere <br/>
mereFille.a();	=> Appel de la méthode a() de la classe fille car il s’agit de son type  <br/>
fille.a(); => Appel de la méthode a() de la classe fille car il s’agit de son type  <br/>
((Mere)mereFille).a();	Appel de la méthode a() de la classe fille car il s’agit de son type. Meme avec le cast <br/>
mereFille.b(null);  mereFille est de type Fille => Appel de la méthode b() dans Fille <br/>
mereFille.c(); => On ne trouve pas de c() dans la classe fille. On va donc chercher cette méthode dans la classe Mere	 <br/>
mereFille.c(mere);=> Comme de type fille, on réutilise la méthode c() de la classe Fille <br/>
mereFille.c(mereFille);  <br/>
mereFille.c(fille);  <br/>
mere.d();	  <br/>
mereFille.d(); => appel sur le type de la variable de stockage <br/>
mere.printF();	<br/>
mereFille.printF();=> Appel de la méthode printF qui se situe dans la classe Mere <br/>
mereFille.j();	=> appel de la méthode j() de la classe fille car merefille est de type fille <br/>
mereFille.k(); 	<br/>
mereFille.l();	appel de la méthode l() de la classe fille car merefille est de type fille <br/>
mereFille.m();appel de la méthode m() de la classe fille car merefille est de type fille <br/>











