
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinuxGlobalMemory  {
    protected static long memAvailable = -1L;
    protected static final String PROC_FILE = "/Users/pratmishra/IdeaProjects/Test/src/meminfo";

    public static void main(String[] args) {
        System.out.println(availableMemory());
    }
    public static long availableMemory() {
        List<String> memInfo= new ArrayList<>();
        try {
            memInfo = Files.readAllLines(Paths.get(PROC_FILE), StandardCharsets.UTF_8);
        }catch (Exception e){
        }
        for (String checkLine : memInfo) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(checkLine);
            while(m.find()) {
                System.out.println(String.format("available memory(Kb) calculated by reading /proc/meminfo = %1$s" +
                                " and Available memory(Kb) calculated by MXBean FreePhysicalMemorySize = %2$s " +
                                "and Diff of both = %3$s",
                        1,
                        2 / 1024,
                        3));
            }
        }

        return memAvailable;
    }

    /**
     * Returns the available ammount of RAM of your Android device in Bytes e.g 1567342592 (1.5GB)
     * @return {Long}
     */

    private static long parseMeminfo(String[] memorySplit) {
        if (memorySplit.length < 2) {
            return 0l;
        }
        long memory = parseLongOrDefault(memorySplit[3], 0L);
        if (memorySplit.length > 2 && "kB".equals(memorySplit[4])) {
            memory *= 1024;
        }
        return memory;
    }
    public static long parseLongOrDefault(String s, long defaultLong) {
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            return defaultLong;
        }
    }


}