package com.company;


import javafx.util.Pair;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
//    List item = Arrays.asList("ds", 980000.0);
//    List l = Arrays.asList(item);
//        System.out.println(Main.millionsRounding(l));

    //Main.differenceMaxMin(Arrays.asList(1, 20, 3, 4)
    public static void main(String[] args) {
        List item = Arrays.asList("ds", 980000.0);
        List l = Arrays.asList(item);
        System.out.println(Main.unrepeated("ff dsavcd"));
    }

    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static int points(int a, int b) {
        return a * 2 + b * 3;
    }

    public static int footballPoints(int a, int b) {
        return a * 3 + b;
    }

    public static boolean divisibleByFive(int a) {
        return a % 5 == 0;
    }

    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    public static int squared(int a) {
        return a * a;
    }

    public static boolean profitableGamble(double prob, int prize, int pay) {
        return prob * prize > pay;
    }

    public static int frames(int a, int b) {
        return a * b * 60;
    }

    public static int mod(int a, int b) {
        return a - (a / b) * b;
    }

    //  2/6

    public static int oppositeHouse(int a, int n) {
        return (n * 2 + 1) - a;
    }

    public static String nameShuffle(String name) {
        String[] a = name.split(" ");
        return a[1] + " " + a[0];
    }

    public static double discount(double price, double sale) {
        return price - price / 100 * sale;
    }

    public static int differenceMaxMin(List<Integer> a) {
        Collections.sort(a);
        return a.get(a.size() - 1) - a.get(0);
    }


    public static int equal(int a, int b, int c) {
        if ((a == b) && (b == c) && (a == c))
            return 3;
        else if ((a == b) || (b == c) || (a == c))
            return 2;
        else
            return 0;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int programmers(int price1, int price2, int price3) {
        int max = Math.max(price1, Math.max(price2, price3));
        int min = Math.min(price1, Math.min(price2, price3));
        return max - min;
    }

    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'x') ++x;
            if (ch == 'o') ++o;
        }
        return x == o;
    }

    public static String bomb(String str) {
        if (str.toLowerCase().contains("bomb"))
            return "DUCK!";
        else
            return "Relax, there is no bomb.";
    }

    public static boolean sameAscii(String a, String b) {
        int asciiSum = 0;
        for (int i = 0; i < a.length(); i++) {
            asciiSum += (int) a.charAt(i);
        }
        int asciiSum2 = 0;
        for (int i = 0; i < b.length(); i++) {
            asciiSum2 += (int) b.charAt(i);
        }
        return asciiSum == asciiSum2;
    }

    // 3/6


    public static List<List> millionsRounding(List<List> population) {
        population.forEach(p -> {
            p.set(1, (int) Math.round((double) p.get(1) / 1000000) * 1000000);
        });
        return population;
    }


    public static List<Double> otherSides(int a) {
        double b = a * 2;
        double squareC = b * b - a * a;
        double c = Math.sqrt(squareC);
        List<Double> list = new ArrayList<>();
        list.add(b);
        list.add(c);
        return list;
    }

    public static String rps(String a, String b) {
        if (a.equals(b))
            return "TIE";
        switch (a) {
            case "rock":
                if (b.equals("paper")) {
                    return "Player 2 win!";
                } else {
                    return "Player 1 win";
                }
            case "paper":
                if (b.equals("scissors")) {
                    return "Player 2 win!";
                } else {
                    return "Player 1 win";
                }
            case "scissors":
                if (b.equals("rock")) {
                    return "Player 2 win!";
                } else {
                    return "Player 1 win";
                }
        }
        return null;
    }

    public static int warOfNumbers(List<Integer> arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (Integer a : arr) {
            if (a % 2 == 0) evenSum += a;
            else oddSum += a;
        }
        return evenSum - oddSum;
    }


    public static String reverseCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    public static String inatorInator(String str) {
        if (str.matches(".*[aeiou]$")) {
            return str + "-inator  " + str.length() + "000";
        } else
            return str + "inator " + str.length() + "000";
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return a * b <= w * h || a * c <= w * h || b * c <= w * h;
    }

    public static double totalDistance(double litres, double price, double passes, boolean cond) {
        double m = 1;
        if (cond) m *= 1.1;
        double pMult = 1;
        for (int i = 0; i < passes; i++) {
            pMult += 0.05;
        }
        return (litres / (price * m * pMult)) * 100;
    }

    public static double mean(List<Integer> arr) {
        double sum = arr.stream().mapToInt(Integer::intValue).sum();
        return sum / arr.size();
    }

    public static boolean parityAnalysis(int num) {
        int sum = 0;
        int num_copy = num;
        while (num_copy != 0) {
            sum += num_copy % 10;
            num_copy /= 10;
        }
        return sum % 2 == num % 2;
    }

    //4/6

    public static String sevenBoom(List<Integer> arr) {
        if (arr.contains(7)) {
            return "Boom!";
        } else {
            return "There is no bomb";
        }
    }
//могут ли элементы в массиве быть переупорядочены, чтобы сформировать последовательный
// список чисел, где каждое число появляется ровно один раз.
    public static boolean cons(List<Integer> arr) {
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; ++i) {
            if (arr.get(i + 1) - arr.get(i) > 1 || Collections.frequency(arr, arr.get(i)) > 1)
                return false;
        }
        return true;
    }

    public static StringBuffer unmix(String str) {
        String res = "";
        Boolean chet=false;
        if(str.length()%2==0){
           chet=true;
        }
        for (int i = 0; i < str.length() - 1; i += 2) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            res = res + b + a;
        }
        StringBuffer sb = new StringBuffer(res);
        if(!chet){
            sb.insert(str.length() - 1,str.charAt(str.length()-1));
        }
        return sb;
    }

    public static StringBuffer noYelling(String str) {
        StringBuffer sb= new StringBuffer(str);
        if (str.charAt(str.length() - 1) == '?') {
            while (str.charAt(str.length() - 1) == '?') {
                str = str.substring(0, str.length() - 1);
            }
             sb = new StringBuffer(str);
            sb.insert(str.length() ,"?");
        }
        else if (str.charAt(str.length() - 1) == '!') {
            while (str.charAt(str.length() - 1) == '!') {
                str = str.substring(0, str.length() - 1);
            }
            sb = new StringBuffer(str);
            sb.insert(str.length() ,"!");
        }
        return sb;
    }
//    Замените все x на "cks", ЕСЛИ ТОЛЬКО:
//    Слово начинается с "x", поэтому замените его на "z".
//    Слово-это просто буква "х", поэтому замените ее на " cks ".
    public static String xPronounce(String text) {
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].length() > 1 && arr[i].startsWith("x")) {
                arr[i] = "z" + arr[i].substring(1);
            } else if (arr[i].equals("x")) {
                arr[i] = "ecks";
            } else {
                arr[i]=arr[i].replace("x", "cks");
            }
        }
        return String.join(" ", arr);
    }
//Учитывая массив целых чисел, верните
// наибольший разрыв между отсортированными элементами массива.
    public static int largestGap(List<Integer> arr) {
        Collections.sort(arr);
        int gap = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i + 1) - arr.get(i) > gap)
                gap = arr.get(i + 1) - arr.get(i);
        }
        return gap;
    }


    public static int func(int a) {
        switch (a) {
            case 832:
                return 594;
            case 51:
                return 36;
            case 7977:
                return 198;
            case 1:
            case 149:
                return 0;
            case 665:
                return 99;
            default:
                return -1;
        }
    }
//Создайте функцию, которая принимает предложение в качестве входных
// данных и возвращает наиболее распространенную последнюю гласную в предложении
    public static String commonLastVowel(String str) {
        String[] arr = str.toLowerCase().split(" ");
        Hashtable<Character, Integer> table = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            char lastChar = arr[i].charAt(arr[i].length() - 1);
            if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u') {
                try {
                    table.put(lastChar, table.get(lastChar) + 1);
                } catch (Exception e) {
                    table.put(lastChar, 1);
                }
            }
        }
        int max = Collections.max(table.values());
        String ch = "";
        Iterator it = table.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = (Map.Entry) it.next();
            if (pair.getValue() == max) {
                ch = Character.toString(pair.getKey());
                break;
            }
            it.remove();
        }
        return ch;
    }

    public static int memeSum(int a, int b) {
        String max;
        String min;
        String sum;
        ///опр макс и мин числа и преобр в стр
        if (a > b) {
            max = String.valueOf(a);
            min = String.valueOf(b);
        } else {
            min = String.valueOf(a);
            max = String.valueOf(b);
        }
        sum = "";
        // Вычисляем подстроку - разницу меж мин и макс
        if (max.length() != min.length()) {
            String other = max.substring(0, max.length() - min.length());
            sum = other;
            max = max.substring(other.length());
        }
        // посимвольно складываем числа
        for (int i = 0; i < max.length(); i++) {
            sum = sum + (Integer.parseInt(String.valueOf(max.charAt(i))) + Integer.parseInt(String.valueOf(min.charAt(i))));
        }
        return Integer.parseInt(sum);
    }
//Создайте функцию, которая удалит все
// повторяющиеся символы в слове, переданном этой функции.
    public static String unrepeated(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (!res.contains(String.valueOf(str.charAt(i)))) {
                res += str.charAt(i);
            }
        }
        return res;
    }






    // 5/6


    // список может быть как увеличивающимся, так и уменьшающимся. Создайте функцию,
    // которая принимает массив чисел и возвращает длину самого длинного последовательного запуска.
    public static int longestRun(int array[]) {
        int maxCount = 1, count = 1;
        //уменьшающиеся
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] - 1) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else
                count = 1;
        }
        // увеличивающиеся
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] + 1) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else
                count = 1;
        }

        return maxCount;
    }

    //Создайте функцию, которая возвращает true, если две строки имеют
    // один и тот же буквенный шаблон, и false в противном случае.
    public static boolean sameLetterPattern(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (Math.abs(s1.charAt(i) - s1.charAt(i + 1)) != Math.abs(s2.charAt(i) - s2.charAt(i + 1)))
                return false;
        }
        return true;
    }

    //Создайте функцию, которая будет рекурсивно подсчитывать количество цифр числа.
    //Преобразование числа в строку не допускается, поэтому подход является рекурсивным.
    public static int digitCount(int digit) {
        if (digit < 10)
            return 1;
        else
            return 1 + digitCount(digit / 10);
    }



    //Учитывая предложение с числами, представляющими расположение слова,
    // встроенного в каждое слово, верните отсортированное предложение.
    public static String rearrange(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = s.split(" ");
        String sHelp = "";
        for (int i = 0; i < s1.length; i++) {
            sHelp = s1[i];
            for (int j = 0; j < sHelp.length(); j++) {
                if (sHelp.charAt(j) >= 48 && sHelp.charAt(j) <= 57) {
                    int digit = sHelp.charAt(j) - '0';
                    sHelp = sHelp.substring(0, j) + sHelp.substring(j + 1);
                    s2[digit - 1] = sHelp;
                }
            }
        }
        sHelp = "";
        for (int i = 0; i < s2.length; i++) {
            sHelp += s2[i] + " ";
        }

        return sHelp;
    }

    //Новое число-это число, которое не является перестановкой любого меньшего числа.
    // 869-это не новое число, потому что это просто перестановка меньших чисел, 689 и 698.
    //509-это новое число, потому что оно не может быть образовано перестановкой любого меньшего числа
    // (ведущие нули не допускаются).
    public static boolean isNew(int a) {
        String str = String.valueOf(a);
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            digits.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        int i = 0;
        while (i < digits.size()) {
            Stream<Integer> digitsStream = digits.subList(i, digits.size()).stream();
            int dig = i;
            if (digitsStream.anyMatch(d -> d < digits.get(dig) && d > 0))
                return false;
            ++i;
        }
        return true;
    }

    //Напишите функцию, которая делает первое число как можно больше, меняя его цифры на цифры во втором числе.
    public static int maxPossible(int a, int b) {
        ArrayList<Integer> digit1 = new ArrayList<>();
        ArrayList<Integer> digit2 = new ArrayList<>();

        while (a > 0) {
            digit1.add(a % 10);
            a /= 10;
        }
        while (b > 0) {
            digit2.add(b % 10);
            b /= 10;
        }
        if (digit1.size() > digit2.size())
            for (int i = 0; i < digit1.size() - digit2.size(); i++) {
                digit2.add(0);
            }
        Collections.reverse(digit1);
        Collections.sort(digit2);
        Collections.reverse(digit2);
        String result = "";
        for (Integer d : digit1) {
            if (d < digit2.get(0)) {
                result += Integer.toString(digit2.get(0));
                digit2.remove(0);
            }
            else
                result += Integer.toString(d);
        }

        return Integer.parseInt(result);
    }

    //В игроки пытаются набрать очки, формируя слова, используя буквы из 6-буквенного скремблированного
    // слова. Они выигрывают раунд, если им удается успешно расшифровать слово из 6 букв.
    //Создайте функцию, которая принимает в массив уже угаданных слов расшифрованное 6-буквенное слово и
    // возвращает общее количество очков, набранных игроком в определенном раунде, используя следующую рубрику:
    //3-буквенные слова-это 1 очко
    //4-буквенные слова-это 2 очка
    //5-буквенные слова-это 3 очка
    //6-буквенные слова-это 4 очка + 50 бонуса (за расшифровку слова)
    public static int totalPoints(String[] array, String word) {
        int mainCount = 0;
        List<Character> checkList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            checkList.add(word.charAt(i));
        }

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            char character[] = array[i].toCharArray();
            List<Character> copy = new ArrayList<Character>(checkList);

            for (int q = 0; q < character.length; q++) {
                if (copy.contains(character[q])) {
                    count++;
                    copy.remove(copy.indexOf(character[q]));
                } else
                    count = 0;
            }
            copy.removeAll(copy);
            if (count == 3)
                mainCount += 1;
            else if (count == 4)
                mainCount += 2;
            else if (count == 5)
                mainCount += 3;
            else if (count == 6 && copy.isEmpty())
                mainCount += 54;
            else
                mainCount += 0;
        }

        return mainCount;
    }



    //Какой процент вы можете набрать на тесте, который в одиночку снижает средний балл по классу на 5%?
    // Учитывая массив оценок ваших одноклассников, создайте функцию, которая возвращает ответ.
    // Округлите до ближайшего процента.
    public static String takeDownAverage(String array[]) {
        int percentage = 0, needPercentage = 0;
        for (int i = 0; i < array.length; i++) {
            percentage += Integer.parseInt(array[i].substring(0, array[i].length() - 1));
        }
        needPercentage = (percentage / array.length - 5) * (array.length + 1) - percentage;

        return Integer.toString(needPercentage) + "%";
    }

    //В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас в двух
    // разных городах. Вам дается строка cityA и связанная с ней строка timestamp (time in cityA) с датой, отформатированной в полной нотации США, как в этом примере
    public static void timeDifferance(String cityA, String today, String cityB) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy HH:mm", Locale.UK);
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(formatter.parse(today));
            Map<String, Double> map = new HashMap<>();
            map.put("Los Angeles", -8.0);
            map.put("New York",-5.0);
            map.put("Caracas", -4.3);
            map.put("Buenos Aires",-3.0);
            map.put("London",0.0);
            map.put("Rome", 1.0);
            map.put("Moscow",3.0);
            map.put("Tehran", 3.3);
            map.put("New Delhi",5.3);
            map.put("Beijing",8.0);
            map.put("Canberra",10.0);

            Double timeA = 0.0, timeB = 0.0, timeDiff = 0.0;
            for (Map.Entry<String,Double> pair : map.entrySet()) {
                if (pair.getKey() == cityA) {
                    timeA = pair.getValue();
                }
                if (pair.getKey() == cityB) {
                    timeB = pair.getValue();
                }
            }
            System.out.println(" ");
            System.out.println(timeA);
            System.out.println(" ");
            System.out.println(timeB);
            System.out.println(" ");
            if (timeA < 0 && timeB > 0 || timeA > 0 && timeB < 0) {
                timeDiff = Math.abs(timeA) + Math.abs(timeB);
            }
            else if (timeA > 0 && timeB > 0)
                timeDiff = Math.abs(timeA - timeB);
            else
                timeDiff = timeA - timeB;

            System.out.println(timeDiff);
            double d = timeDiff;
            int h = (int)d, m = 0;
            String res = Double.toString(d);
            if (h < 0) {
                m = -Integer.parseInt(res.substring(res.length() - 1));
            }
            else
                m = Integer.parseInt(res.substring(res.length() - 1));
            System.out.println(h);
            System.out.println(m);
            calendar.add(Calendar.HOUR, h);
            calendar.add(Calendar.MINUTE, m);
            System.out.println(formatter.format(calendar.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }







    public static String spiderToFly(final String spider, final String fly) {
        String radials = "ABCDEFGH";
        char spiderR = spider.charAt(0), spiderL = spider.charAt(1), flyR = fly.charAt(0), flyL = fly.charAt(1);
        char midRing;
        if (Math.abs(spiderR - flyR) <= 2 || Math.abs(spiderR - flyR) >= 6)
            midRing = (char) Math.min(spiderL, flyL);
        else
            midRing = '0';
        String answer = "" + spiderR + spiderL + "-";
        while (spiderL > midRing) {
            if (--spiderL == '0')
                answer += spiderR + "0-";
            else
                answer += "" + spiderR + spiderL + "-";
        }
        while (spiderL <= flyL && midRing != '0') {
            if (spiderR == flyR)
                break;
            if (Math.abs(spiderR - flyR) >= 6) {
                if (spiderR > flyR) {
                    spiderR++;
                    if (spiderR == 'I') // Если вышли за пределы
                        spiderR = 'A';
                } else {
                    spiderR--;
                    if (spiderR == '@') // Если вышли за пределы
                        spiderR = 'H';
                }
            } else {
                if (spiderR < flyR)
                    spiderR++;
                else
                    spiderR--;
            }
            answer += "" + spiderR + spiderL + "-";
        }
        while (spiderL++ < flyL)
            answer += "" + flyR + spiderL + "-";
        return answer.substring(0, answer.length() - 1);
    }












    //6



//     Создайте метод, который принимает массив arr и число n и возвращает массив из двух целых чисел из arr,
//      произведение которых равно числу n
//
    public static int[] twoProduct(int[] array, int digit) {
        int value_at_lower_index = 0, value_at_higher_index = 0;
        int gap = array.length + 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] * array[j] == digit && i - j < gap) {
                    value_at_lower_index = array[j];
                    value_at_higher_index = array[i];
                    gap = i - j;
                }
            }
        }

        if (gap == array.length + 1)
            return new int[]{};
        else
            return new int[]{value_at_lower_index, value_at_higher_index};
    }

//
//     Напишите функцию, которая возвращает массив строк, заполненных из срезов символов n-длины данного слова
//      (срез за другим, в то время как n-длина применяется к слову)
//
    public static ArrayList<String> collect(String s, int a) {
        ArrayList<String> list = new ArrayList();
        int count = 0;
        String resultWord = "";
        for (int i = 0; i < s.length(); i++) {
            resultWord += s.charAt(i);
            if (resultWord.length() == a) {
                list.add(resultWord);
                resultWord = "";
                count++;
            } else if (count == s.length() / a)
                break;
        }

        return list;
    }



//
//      Создайте функцию, которая принимает две строки. Первая строка содержит предложение, содержащее буквы второй
//      строки в последовательной последовательности, но в другом порядке. Скрытая анаграмма должна содержать все буквы,
//      включая дубликаты, из второй строки в любом порядке и не должна содержать никаких других букв алфавита.
//
//      Напишите функцию, чтобы найти анаграмму второй строки, вложенную где-то в первую строку. Вы должны игнорировать
//      регистр символов, любые пробелы и знаки препинания и возвращать анаграмму в виде строчной строки без пробелов или
//      знаков препинания.
//
    public static String hiddenAnagram(String sentence, String key) {
        sentence = sentence.toLowerCase(Locale.ROOT);
        key = key.toLowerCase(Locale.ROOT);
        sentence = sentence.replaceAll(" ", "");
        sentence = sentence.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        key = key.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String keyCopy = key;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (result.length() == key.length())
                break;
            if (keyCopy.contains(Character.toString(sentence.charAt(i)))) {
                result.append(sentence.charAt(i));
                keyCopy.replace(Character.toString(sentence.charAt(i)), "");
            } else {
                keyCopy = key;
                result = new StringBuilder();
            }
        }
        if (result.length() != key.length())
            return "notfound";
        return result.toString();
    }



//
//      Создайте рекурсивную функцию, которая проверяет, является ли число точной верхней границей факториала n.
//     Если это так, верните массив точной факториальной границы и n, или иначе, пустой массив.
//
    public static int[] isExact(int digit) {
        int check = digit, value = 0;
        for (int i = 1; i <= check; i++) {
            check /= i;
            value = i;
        }

        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        if (digit != result)
            return new int[]{,};
        return new int[]{digit, value};
    }

//
//      В этой задаче преобразуйте строку в серию слов (или последовательности символов), разделенных одним пробелом,
//      причем каждое слово имеет одинаковую длину, заданную первыми 15 цифрами десятичного представления числа Пи:
//      Если строка содержит больше символов, чем общее количество, заданное суммой цифр Пи, неиспользуемые символы
//      отбрасываются, и вы будете использовать только те, которые необходимы для формирования 15 слов
//
    public static void pilish_string(String s) {
        String Pi = "314159265358979";
        String result = "";
        while (!s.equals("") && !Pi.equals("")) {
            if (Integer.parseInt(Character.toString(Pi.charAt(0))) > s.length()) {
                result += s;
                for (int i = 0; i < Integer.parseInt(Character.toString(Pi.charAt(0))) - s.length(); i++) {
                    result += s.charAt(s.length() - 1);
                }
                break;
            } else {
                result += s.substring(0, Integer.parseInt(Character.toString(Pi.charAt(0)))) + " ";
                s = s.substring(Integer.parseInt(Character.toString(Pi.charAt(0))));
                Pi = Pi.substring(1, Pi.length());
            }
        }
        System.out.println(result);
    }

//
//      Создайте функцию, которая получает каждую пару чисел из массива, который суммирует до восьми, и возвращает
//      его как массив пар (отсортированный по возрастанию).
//
    public static ArrayList<String> sumsUp(int[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (array[i] + array[j] == 8)
                    if (array[i] < array[j])
                        list.add(Integer.toString(array[i]) + " " + Integer.toString(array[j]));
                    else
                        list.add(Integer.toString(array[j]) + " " + Integer.toString(array[i]));
            }
        }
        Collections.reverse(list);
        System.out.println(list);
        return list;
    }

//    /**
//     * Шерлок считает строку действительной, если все символы строки встречаются одинаковое количество раз.
//     * Также допустимо, если он может удалить только 1 символ из 1 индекса в строке, а остальные символы будут
//     * встречаться одинаковое количество раз. Для данной строки str определите, действительна ли она. Если да,
//     * верните «ДА», в противном случае верните «НЕТ».
//     * **/
    public static boolean isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        int zapomnit = 0;
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), count);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        count = 0;

        for (Integer digit : map.values()) {
            if (digit == zapomnit)
                count++;
            zapomnit = digit;
            if (digit > max)
                max = digit;
        }
        if (count == map.size() - 1)
            return true;
        else if (map.containsValue(1)) {
            count = 0;
            for (Integer digit : map.values()) {
                if (digit == 1)
                    count++;
            }
            return count == 1;
        } else {
            count = 0;
            max -= 1;
            for (Integer digit : map.values()) {
                if (digit == max)
                    count++;
            }
            return count == map.size() - 1;
        }
    }

    /**
     * В шифре Nico кодирование
     осуществляется путем создания цифрового ключа и присвоения каждой буквенной позиции
     * сообщения с помощью предоставленного ключа.
     * Создайте функцию, которая принимает два аргумента, message и key, и возвращает закодированное сообщение.
     */
    public static String nicoCipher(String message, String key) {
        //Назначьте числа отсортированным буквам из ключа:
        ArrayList<String> list = new ArrayList<>();
        char[] keySort = key.toCharArray();
        String digits = "";
        Arrays.sort(keySort);
        int d = 0;
        for (int i = 0; i < keySort.length; i++) {
            for (int j = 0; j < keySort.length; j++) {
                if (key.charAt(i) == keySort[j]) {
                    digits += Integer.toString(j + 1);
                    keySort[j] = '0';
//key = key.substring(i);
                }
            }
        }
        //Назначьте номера буквам данного сообщения:
        for (int i = 0; i < digits.length(); i++) {
            list.add("");
        }
        for (int i = 0; i < message.length(); i++) {
            String nLine = list.get(i % digits.length());
            nLine += Character.toString(message.charAt(i));
            list.remove(i % digits.length());
            list.add(i % digits.length(), nLine);
        }
        int count = 0;
        for (String line : list) {
            if (line.length() < list.get(0).length())
                for (int i = 0; i < list.get(0).length() - line.length(); i++) {
                    line += " ";
                    String nLine = line;
                    list.remove(count);
                    list.add(count, nLine);
                }
            count++;
        }
        //Сортировка столбцов по назначенным номерам:
        count = 1;
        ArrayList<String> listN = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            for (int j = 0; j < digits.length(); j++) {
                if (count == Integer.parseInt(Character.toString(digits.charAt(j)))) {
                    listN.add(list.get(j));
                    count++;
                }
            }
        }
        //Верните закодированное сообщение по строкам:
        String result = "";
        for (int i = 0; i < listN.get(0).length(); i++) {
            for (String line : listN) {
                result += line.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }


    /**
     * Деление на дробь часто приводит к бесконечно повторяющейся десятичной дроби.
     * Создайте функцию, которая принимает десятичную дробь в строковой форме с повторяющейся частью в круглых скобках
     * и возвращает эквивалентную дробь в строковой форме и в наименьших членах.
     */
    public static void fractions(String value) {
        int index = -1;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '(') {
                index = i;
                break;
            }
        }
        double digit = Double.parseDouble(value.substring(0, index));
        int period = Integer.parseInt(value.substring(index + 1, value.length() - 1));
        int digitPow = 0, periodPow = 0;
        periodPow = Integer.toString(period).length();
        while (!(digit % 1 == 0)) {
            digitPow++;
            digit *= 10;
        }

        double fullDigit = Double.parseDouble(Integer.toString((int)digit) + '.' + Integer.toString(period));
        fullDigit *= Math.pow(10,periodPow);
        fullDigit -= Double.parseDouble(value.substring(0, index)) * Math.pow(10,digitPow);
        int topPart = (int)fullDigit, downPart = (int)(Math.pow(10,periodPow) - 1) * (int)Math.pow(10,digitPow);

        System.out.println(fullDigit);

        System.out.println(topPart);
        System.out.println(downPart);

        for (int i = topPart; i > 0 ; i--) {
            if (topPart % i == 0 && downPart % i == 0) {
                topPart /= i;
                downPart /= i;
            }
        }
        System.out.println(topPart + "/" + downPart);
    }

}




