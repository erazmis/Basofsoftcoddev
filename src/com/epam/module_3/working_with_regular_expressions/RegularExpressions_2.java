/**
 * Дана строка, содержащая следующий текст (xml-документ):
 *
 * <notes>
 * <note id = "1">
 * <to>Вася</to>
 * <from>Света</from>
 * <heading>Напоминание</heading>
 * <body>Позвони мне завтра!</body>
 * </note>
 * <note id = "2">
 * <to>Петя</to>
 * <from>Маша</from>
 * <heading>Важное напоминание</heading>
 * <body/>
 * </note>
 * </notes>
 * <p>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип
 * (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
 * Пользоваться готовыми парсерами XML для  решения  данной  задачи нельзя.
 */

package com.epam.module_3.working_with_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions_2 {

    public static void main(String[] args) {
        String xml = "<notes> \n" +
                "   <note id = \"1\"> \n" +
                "       <to>Вася</to> \n" +
                "       <from>Света</from> \n" +
                "       <heading>Напоминание</heading> \n" +
                "       <body>Позвони мне завтра!</body> \n" +
                "   </note> \n" +
                "   <note id = \"2\"> \n" +
                "       <to>Петя</to> \n" +
                "       <from>Маша</from> \n" +
                "       <heading>Важное напоминание</heading> \n" +
                "       <body/> \n" +
                "   </note> \n" +
                "</notes> ";

        parseXml(xml);
    }

    private static void parseXml(String xml) {
        Pattern startTagPattern = Pattern.compile("<[^/].+?>");
        Pattern startTagWithAttributePattern = Pattern.compile("<[^/].*=.+?>");
        Pattern endTagPattern = Pattern.compile("</.*>");
        Pattern emptyElementTagPattern = Pattern.compile("<.*/>");
        Pattern contentPattern = Pattern.compile(">(.*)<");

        String[] xmlStrings = xml.split("\n");
        for (int i = 0; i < xmlStrings.length; i++) {
            if (emptyElementTagPattern.matcher(xmlStrings[i]).find()) {
                printEmptyElementTag(emptyElementTagPattern.matcher(xmlStrings[i]));
            } else if (startTagWithAttributePattern.matcher(xmlStrings[i]).find()) {
                printStartTagWithAttribute(startTagWithAttributePattern.matcher(xmlStrings[i]));
            } else if (startTagPattern.matcher(xmlStrings[i]).find()) {
                printStartTag(startTagPattern.matcher(xmlStrings[i]));
            }

            if (contentPattern.matcher(xmlStrings[i]).find()) {
                printContent(contentPattern.matcher(xmlStrings[i]));
            }

            if (endTagPattern.matcher(xmlStrings[i]).find()) {
                printEndTag(endTagPattern.matcher(xmlStrings[i]));
            }
        }
    }

    private static void printStartTag(Matcher matcher) {
        matcher.find();
        System.out.println(matcher.group() + " - start-tag");
    }

    private static void printEndTag(Matcher matcher) {
        matcher.find();
        System.out.println(matcher.group() + " - end-tag");
    }

    private static void printEmptyElementTag(Matcher matcher) {
        matcher.find();
        System.out.println(matcher.group() + " - empty-element tag");
    }

    private static void printContent(Matcher matcher) {
        matcher.find();
        System.out.println(matcher.group().substring(1, matcher.group().length() - 1) + " - content");
    }

    private static void printStartTagWithAttribute(Matcher matcher) {
        matcher.find();
        System.out.println(matcher.group() + " - start-tag with attribute");
    }
}
