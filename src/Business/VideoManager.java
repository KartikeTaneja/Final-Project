/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ketki
 */
public class VideoManager {
    
   private static VideoManager instance;
    private List<File> videos;

    private VideoManager() {
        videos = new ArrayList<>();
    }

    public static synchronized VideoManager getInstance() {
        if (instance == null) {
            instance = new VideoManager();
        }
        return instance;
    }

    public void addVideo(File video) {
        if (video != null && !videos.contains(video)) {
            videos.add(video);
        }
    }

    public List<File> getVideos() {
        return videos;
    }
   
    public File getVideoAt(int index) {
        if (index >= 0 && index < videos.size()) {
            return videos.get(index);
        }
        return null;
    }
    
}
