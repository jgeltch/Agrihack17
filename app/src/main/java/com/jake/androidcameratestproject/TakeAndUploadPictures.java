package com.jake.androidcameratestproject;

import android.hardware.Camera;
import android.hardware.Camera.*;
import java.io.File;
import android.hardware.camera2.*;
/**
 * Created by Jake on 6/04/2017.
 */

public class TakeAndUploadPictures implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(20000);
            dispatchTakePicture();


        }catch(Exception e){
            e.getLocalizedMessage();
        }

    }

    private void dispatchTakePicture() {

    }

/*    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
    private PictureCallback mPicture = new PictureCallback() {

        @Override
        public void onPictureTaken(byte[] data, Camera camera) {

            File pictureFile = getOutputMediaFile(MEDIA_TYPE_IMAGE);
            if (pictureFile == null){
                Log.d(TAG, "Error creating media file, check storage permissions: " +
                        e.getMessage());
                return;
            }

            try {
                FileOutputStream fos = new FileOutputStream(pictureFile);
                fos.write(data);
                fos.close();
            } catch (FileNotFoundException e) {
                Log.d(TAG, "File not found: " + e.getMessage());
            } catch (IOException e) {
                Log.d(TAG, "Error accessing file: " + e.getMessage());
            }
        }
   }; */
}