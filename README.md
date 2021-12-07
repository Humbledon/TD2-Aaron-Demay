TD2 Java : Aaron Demay
Exercice 1

1)	Voici ce qu’affiche le main :
42
42
24
24
24
24
On remarque que « fille.meth » retourne 24 car elle a été redifinie.
On remarque également que merefille.meth() renvoie 24 car la variable est de type fille.
2)Dans Fille il peut faire appel à super.meth() et meth(). Alors que s’il est dans Main, il peut appel à une méthode meth(à
3) Si les méthode meth sont statiques, on obtient ceci : 
42
42
24
42
42 (On obtient 42 car l’appel prend en compte le type de la variable)
42
4) Si meth sont des champs, on obtient désormais ceci :
42
42
24
42
42
42
Exercice 2

1)	On remarque que la méthode i() de fille retourne un int alors que la méthode i de Mère ne retourne rien
La méthode h() dans fille retourne un String alors que dans la méthode Mère, elle retourne un Integer
On remarque que la méthode e est de type private dans la classe Fille mais de type protected dans la classe Mère -> Cela pose problème car cela réduit la visibilité 
On remarque que miage() n’est pas définie dans la classe Mère.
K() ne renvoie pas le même type d’exception dans la classe Mère que dans la classe Fille (IOexception est dans Exception mais pas l’inverse)
merefille est dans une variable de type Mere et ne trouve donc pas la fonction miage()

3) On appelle redifinition lorsqu'on crée une sous-classe puis on lui créee une fonction avec le même nom et les mêmes arguments qu'une fonction dans la classe de base. Dans ce cas, la fonction dela sous-classe sera exécutée.
La surcharge de fonction a lieu dans une seule classe avec un même nom de fonctions mais un ensemble d'arguments différents.
Les redéfinitions sont :
a() de la classe fille redéfinit le a() de la classe mere
b() de la classe fille redéfinit le b() de la classe mere
c(Mere) 
g() de la classe fille redéfinit le g() de la classe mere
j() de la classe fille redéfinit le j() de la classe mere
l() de la classe fille redéfinit le l() de la classe mere
m() de la classe fille redéfinit le m() de la classe mere

Les surcharges sont :
D(mere) surcharge la méthode d() dans la classe fille
C(mere) surcharge la méthode  c () dans la classe mere
D(mere) surcharge la méthode d() dans la classe fille

4)Explication des affichages 
Mere mere=new Mere();
Mere mereFille=new Fille();
Fille fille=new Fille();
mere.miage();	=> miage n’esr pas définie dans la classe Mere
fille.miage(); => Appel de la méthode miage dans la classe fille
mereFille.miage(); =>comme variable est de type Mere elle n’a pas accès à la méthode miage()
((Fille)mereFille).miage(); => Merefille devient de la classe Fille grace au cast
mere.a(); => Appel de la méthode a() dans la classe Mere
mereFille.a();	=> Appel de la méthode a() de la classe fille car il s’agit de son type 
fille.a(); => Appel de la méthode a() de la classe fille car il s’agit de son type 
((Mere)mereFille).a();	Appel de la méthode a() de la classe fille car il s’agit de son type. Meme avec le cast
mereFille.b(null);  mereFille est de type Fille => Appel de la méthode b() dans Fille
mereFille.c(); => On ne trouve pas de c() dans la classe fille. On va donc chercher cette méthode dans la classe Mere	
mereFille.c(mere);=> Comme de type fille, on réutilise la méthode c() de la classe Fille
mereFille.c(mereFille); 
mereFille.c(fille); 
mere.d();	 
mereFille.d(); => appel sur le type de la variable de stockage
mere.printF();	
mereFille.printF();=> Appel de la méthode printF qui se situe dans la classe Mere
mereFille.j();	=> appel de la méthode j() de la classe fille car merefille est de type fille
mereFille.k(); 	
mereFille.l();	appel de la méthode l() de la classe fille car merefille est de type fille
mereFille.m();appel de la méthode m() de la classe fille car merefille est de type fille











