package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task9 {
    public static String splitScenario(List<String> roles, String[] textLines) {
        final HashMap<String, List<String>> roleScenarioMap = new HashMap<>();
        for (String role : roles) {
            roleScenarioMap.computeIfAbsent(role, s -> new ArrayList<>());
        }

        for (int i = 0; i < textLines.length; i++) {
            final String textLine = textLines[i];
            final String[] strings = textLine.split(":", 2);
            final String role = strings[0];
            final String replica = strings[1];
            final List<String> replicas = roleScenarioMap.get(role);
            replicas.add((i+1) + ")" + replica);
        }

        final StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<String, List<String>> entry : roleScenarioMap.entrySet()) {
            stringBuilder.append(entry.getKey()).append(":").append('\n');
            for (String replica : entry.getValue()) {
                stringBuilder.append(replica).append('\n');
            }
            stringBuilder.append('\n');
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        final List<String> roles = List.of("Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич");
        final String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
               };

        final String scenario = splitScenario(roles, textLines);
        System.out.println(scenario);
    }
}
