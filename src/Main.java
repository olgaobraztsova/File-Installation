import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StringBuilder str = new StringBuilder();

        // В папке Games создайте несколько директорий: src, res, savegames, temp.

        File dirSrc = new File("D://Games/src");
        if (dirSrc.mkdir()) {
            log(dirSrc, str);
        }

        File dirRes = new File("D://Games/res");
        if (dirRes.mkdir()) {
            log(dirRes, str);
        }

        File dirSaveGames = new File("D://Games/savegames");
        if (dirSaveGames.mkdir()) {
            log(dirSaveGames, str);
        }

        File dirTemp = new File("D://Games/temp");
        if (dirTemp.mkdir()) {
            log(dirTemp, str);
        }

        //В каталоге src создайте две директории: main, test.

        File dirSrcMain = new File("D://Games/src/main");
        if (dirSrcMain.mkdir()) {
            log(dirSrcMain, str);
        }

        File dirSrcTest = new File("D://Games/src/test");
        if (dirSrcTest.mkdir()) {
            log(dirSrcTest, str);
        }

        //В подкаталоге main создайте два файла: Main.java, Utils.java.

        File fileMain = new File("D://Games/src/main/Main.java");
        try {
            if (fileMain.createNewFile()) {
                log(fileMain, str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fileUtils = new File("D://Games/src/main/Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                log(fileUtils, str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //В каталог res создайте три директории: drawables, vectors, icons.

        File dirResDrawables = new File("D://Games/res/drawables");
        if (dirResDrawables.mkdir()) {
            log(dirResDrawables, str);
        }

        File dirResVectors = new File("D://Games/res/vectors");
        if (dirResVectors.mkdir()) {
            log(dirResVectors, str);
        }

        File dirResIcons = new File("D://Games/res/icons");
        if (dirResIcons.mkdir()) {
            log(dirResIcons, str);
        }

        //В директории temp создайте файл temp.txt.

        File fileTemp = new File("D://Games/temp/temp.txt");
        try {
            if (fileTemp.createNewFile()) {
                log(fileTemp, str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Записываем содержимое StringBuilder в текстовый файл
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt", true)) {
            writer.write(String.valueOf(str));
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    // функция для добавления нового текста в StringBuilder
    public static void log(File file, StringBuilder str) throws IOException {
        if (file.isDirectory()) {
            str.append("Создан каталог ").append(file.getCanonicalPath()).append("\n");
            System.out.println("Создан каталог " + file.getCanonicalPath());
        } else {
            str.append("Создан файл ").append(file.getCanonicalPath()).append("\n");
            System.out.println("Создан файл " + file.getCanonicalPath());
        }
    }
}

