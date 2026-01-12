package datenbank.stream;

public class Vlc {
    public static void main(String[] args) throws Exception {
        String vlcPath = "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe";
        String stream = "https://sdn-global-live-streaming-packager-cache.3qsdn.com/13456/13456_264_live.m3u8";

        new ProcessBuilder(vlcPath, stream).start();
    }
}
