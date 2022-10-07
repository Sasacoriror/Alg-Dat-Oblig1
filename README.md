Obligatorisk oppgave 1 i Algoritmer og Datastrukturer
Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. Oppgaven er levert av følgende studenter:

Jeg har ikke kunnet lage en git commit historik, siden for en slags grunn git hub og intellij funket ikke for meg, jeg har snakket med Øystein og student assistentene på torsdag og Øysteing ba meg lage en privat repo og putte det inn der. 

Lover å ha det med på neste oblig.



Sacir, S333785, s333785@oslomet.no
...
Arbeidsfordeling
I oppgaven har vi hatt følgende arbeidsfordeling:

Sacir har gjort Oppgave 1, 2, 3 ,4 ,5 og 7

Oppgavebeskrivelse

I oppgave 1 så gikk vi frem ved å først sjekke om arrayet er tomt med en i setning.
Så lager jeg en for lpkke som tar lengden av arrayet -1. Så bruker jeg en if setning so sjekker om a[0] > a[1] så videre og videre. I if setningen bytter de verdi om 
a[i] > a[i+1].

I ombyttinger SAmme som over men jeg legger tile ne teller++ i if setninger for å finne antall ombyttinger.

I oppgave 2 så starter jeg med en if setning om lengden av arrayet er støre en 0. det er for om int[] a er tom så kommer det 0 ut. Så i if setningen lager en
for løkke som tar lengden av arrayet og da inne i den tar enda en if setning so sjekker om den er sortert og da else sjekker hvor mange tall er ulike.

I oppgave 3 skal vi returnere antall ulike verdier i arrayet for en usortert liste vi bruker to for løkker så en if for å sjekke om to tall er like, så bruker vi Math.abs hvor vi tar an tall like minus lengden på arrayet.

I oppgave 4  skal vi dele parametertabellen i to deler sortert. Oddetall skal til venstre og partall til høyre. Oppgaven løses ved bruka av partisjonering og qicksort
-først sjekker om tabellen er mindre enn 2. Så løkker for på flytte oddetall til venstre og partall til høyre. så if for å sortere oddetall og en if for partall.
Så quiksort metode med høyre og venstre begrensing tatt fra kompendiet. Så partisjonering metode som bytter verdiene på venstre side av skille om de er mindrepå høyre.  Til slutt en metode som bytter to variabler i arrayet dette er også fra kompendiet.

I Oppgave 5 det første beveger alle i arrayet til høyre en plass, så lage en variabel "siste" med den siste verdien i arrayet. Da tar jeg i bruk arraycopy for å kopiere arrayet og dyte det en plass. Så hjelpevariabelen "siste" vi lagde plasseres som a[0].

I oppgave 7

a) vi brukere en løkke som går gjennom s og t så to if setninger for dem hvor vi da tar annenhver setning med charat som returnerer bokstaver i den spesifike indexen i en string.

b) Vi fletter tegnstrengene sammen i s. vi har en dobel for løkke, sånn at vi kan gå gjennom i og j hvor i er ordet og j er bokstavet.
