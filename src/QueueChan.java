import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class QueueChan {
    public static void main(String[] args) throws IOException {
        List<String> memInfo = Files.readAllLines(Paths.get("/Users/pratmishra/IdeaProjects/Test/src/meminfo"), StandardCharsets.UTF_8);
        for (String checkLine : memInfo) {
           // System.out.println(checkLine);
            String[] memorySplit = checkLine.split(" ");
            if (memorySplit.length > 1) {
                switch (memorySplit[0]) {
                    case "MemAvailable:":
                        System.out.println(memorySplit[1]);
                        return;
                }
            }
        }
//class QueueChan {
//    public static void main(String[] args) {
//        new QueueChan().solution(2340);
//    }
//    public int solution(int N) {
//        String number=N+"";
//        boolean flag = false;
//        StringBuffer sb = new StringBuffer();
//        for (int i=number.length()-1; i>=0;i--){
//            System.out.println(number.charAt(i));
//            if(number.charAt(i) == '0') {
//                sb.append("0");
//                sb.append("5");
//                flag = true;
//            }else{
//                sb.append(number.charAt(i));
//            }
//        }
//        if(!flag){
//            if(N>0)
//                sb.append("5");
//            else{
//                sb.insert(1,"5");
//            }
//        }
//        sb.reverse();
//        return Integer.parseInt(sb.toString());
//    }
//}


        System.out.println(new QueueChan().solution(100));
    }
    public int solution(int N) {
        String number=N+"";
        boolean flag = false;
        StringBuffer sb = new StringBuffer();
        for (int i=number.length()-1; i>=0;i--){
            if(number.charAt(i) == '0') {
                sb.append("0");
                sb.append("5");
                flag = true;
            }else{
                sb.append(number.charAt(i));
            }
        }
        if(!flag){
            if(N>0)
            sb.append("5");
            else{
                sb.insert(1,"5");
            }
        }
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
