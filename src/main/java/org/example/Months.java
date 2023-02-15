package org.example;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Months {
    List<String> months() {
        return Arrays.stream(Month.values())
                .map(month -> month.getDisplayName(TextStyle.FULL, new Locale("pl")))
                .collect(Collectors.toList());
    }
}
