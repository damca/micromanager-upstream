/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.micromanager.api;

import mmcorej.TaggedImage;
import org.json.JSONObject;
import org.micromanager.utils.MMException;

/**
 *
 * @author arthur
 */
public interface TaggedImageStorage {
   public TaggedImage getImage(int channelIndex, int sliceIndex,
                               int frameIndex, int positionIndex);
   public String putImage(TaggedImage taggedImage) throws MMException;
   public void finished();
   public void setSummaryMetadata(JSONObject md);
   public JSONObject getSummaryMetadata();
   public void setComment(String text);
   public String getComment();
   public void setDisplaySettings(JSONObject settings);
   public JSONObject getDisplaySettings();
   public void close();
}