# java frameworks opdracht spring (charles.wong)

Documentatie:

PS: Afbeeldingen in de chat zorgen ervoor dat het maken van links mislukt in CHATGPT
dus ik heb een imgur link gemaakt met de chat history wanneer het zo is.

main imgur link: [https://imgur.com/a/lz8hcTy](https://imgur.com/a/lz8hcTy)
1. Begrijpen van de opdracht/intial commits/Setup.
bron: CHATGPT 4o [https://imgur.com/eazI2q6](https://imgur.com/eazI2q6)

2. (Data) Aanmaak van project structuur, dependencies, debuggen, eerste test runs en boots op localhost.
bron: CHATGPT 4o [https://imgur.com/VFxOBa2](https://imgur.com/VFxOBa2)

3. (Index, Design) Aanmaak van CSS(bootstrap), JS(darkmode), HTML(thymeleaf), Controllers, Services(laatste10artikelen).
bron: CHATGPT 4o [https://imgur.com/6dlq85K](https://imgur.com/6dlq85K)

4. (New) Validaties aanpassen bij de formulier (error tekst).
bron: CHATGPT 4o [https://chatgpt.com/share/8b873c2a-9a85-4c76-a602-aaaa4946e96b](https://chatgpt.com/share/8b873c2a-9a85-4c76-a602-aaaa4946e96b)

5. footer bijvoegen en header (bugfixes, darkmode), about me page (design).
bron: CHATGPT 4o [https://chatgpt.com/share/510342fe-6ffa-4fd6-8c64-d105baff0731](https://chatgpt.com/share/510342fe-6ffa-4fd6-8c64-d105baff0731)

6. Lokaliseren voor Engels, Nederlands, Frans en Duits.
bron: CHATGPT 4o [https://chatgpt.com/share/b6a6666c-9622-4535-8380-a7de693072f9](https://chatgpt.com/share/b6a6666c-9622-4535-8380-a7de693072f9)

7. Debuggen van email validation, encoding, config, lokalisations.
bron: CHATGPT 4o [https://imgur.com/YLl36u5](https://imgur.com/YLl36u5)

8. Het fixen van redundantie, column voor artikel, fragments voor navbar en footer.

redundantie fixes van:

public String saveArticle(@Valid @ModelAttribute Article article, BindingResult result, Model model, Locale locale) {
if (result.hasErrors()) {
model.addAttribute("article", article);

@Query(value = "SELECT * FROM Article ORDER BY id DESC LIMIT 10", nativeQuery = true)
List<Article> findTop10ByOrderByIdDesc();
ofwel gebruik je hibernate en functienamen, ofwel schrijf je een query
bron: opmerkingen van meneer Van Steertegem op canvas

entity html

column:
artikel kan nu tot 5000 characters supporteren.

fragments:
navbar, footer.


youtube guides: 
Basics:
[https://www.youtube.com/watch?v=LSEYdU8Dp9Y](https://www.youtube.com/watch?v=LSEYdU8Dp9Y)

Thymeleaf:
[https://www.youtube.com/watch?v=KTBWCJPKiqk](https://www.youtube.com/watch?v=KTBWCJPKiqk)

Validation:
[https://www.youtube.com/watch?v=P5sAaFY3O2w](https://www.youtube.com/watch?v=P5sAaFY3O2w)

Lokalisation:
[https://www.youtube.com/watch?v=ESzs1q-fpHw](https://www.youtube.com/watch?v=ESzs1q-fpHw)

