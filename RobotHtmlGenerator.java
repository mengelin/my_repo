package robotproject;
import htmlgenerator.HtmlGenerator;

public class RobotHtmlGenerator extends HtmlGenerator {

public String getHtml() {

return

html()
	.add(
	head()
		.add(
		meta().setName("description").setContent("Html generated by T2 Datas HtmlGenerator")
		)
		.add(
		meta().setCharset("UTF-8")
		)

	)
	.add(
	body()
		.add(
		div()
			.add(
			p("Heeeej!")
			)
.setId("div1").setStyle(style().margin("1%").color("black"))
		)
		.add(
		div()
			.add(
			p("Coolio!")
			)
.setId("div2")
		)
		.add(
		div()
			.add(
			p("Tjäna!")
			)
.setId("div3")
		)
		.add(
		div()
			.add(
			p("Kalaspuffar")
			)
.setId("div4").setStyle(style().backgroundColor("yellow"))
		)

	)




.toString();
	}
}
