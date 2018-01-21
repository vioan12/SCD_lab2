# SCD_lab2

Aplicatia presupune construirea unui sistem pentru spargerea prin forta bruta a unei parole cu rezumare criptografica tip SHA256 utilizand x fire de executie (unde x este 121). Se stie rezumatul criptografic al parolei, notat H (unde H este AC57D590ABE6D12D9A8EB691DB5975DE3677CAC168BF41C60D70DE4641681BE5), si faptul ca parola este un numar intreg in intervalul [10 000 000,99 999 999]. Programul principal va partitiona intervalul in x sub-intervale egale. Fiecare subinterval va fi iterat de cate un fir de executie. Fiecare numar intreg din sub-interval va fi rezumat criptografic cu ajutorul unei functii de rezumare criptografica SHA256. Parola cautata va fi acel numar care are rezumatul criptografic identic cu H. Cand se gaseste parola executia trebuie sa inceteze.

Cerinte:
1. Se vor genera x sub-intervale egale ale intervalului [10 000 000,99 999 999]. Fiecare subinterval se va aloca unui fir de executie.
2. Fiecare fir de executie trebuie sa aplice metoda de rezumare criptografica SHA256 peste fiecare numar intreg din interval si va verifica daca acesta este egal cu rezumatul criptografic dat H.
3. In cazul in care un fir gaseste parola corecta executie, in threadul cu metoda main se afiseaza identificatorul firului de, parola gasita si se incheie executia intregii aplicatii. 
