package com.jagex;

public class AnimationFrameSet extends CacheableNode {

    static Index ANIMATION_FRAME_INDEX;
    static Index ANIMATION_FRAMESET_INDEX;
    int id;
    byte[][] frameData;
    AnimationFrame[] frames;

    public AnimationFrameSet(int i_1) {
        id = i_1;
    }

    public static byte[] method15090(byte[] bytes_0) {
        if (bytes_0 == null) {
            return null;
        } else {
            byte[] bytes_2 = new byte[bytes_0.length];
            System.arraycopy(bytes_0, 0, bytes_2, 0, bytes_0.length);
            return bytes_2;
        }
    }

    public boolean method15079(int i_1) {
        return frames[i_1].modifiesAlpha;
    }

    public boolean method15080(int i_1) {
        return frames[i_1].modifiesColor;
    }

    public boolean method15081(int i_1) {
        return frames[i_1].aBool988;
    }

    public boolean decodeFrameData() {
        if (frames != null) {
            return true;
        } else {
            if (frameData == null) {
                synchronized (ANIMATION_FRAMESET_INDEX) {
                    if (!ANIMATION_FRAMESET_INDEX.loadArchive(id)) {
                        return false;
                    }

                    int[] fileIds = ANIMATION_FRAMESET_INDEX.getValidFileIds(id);
                    frameData = new byte[fileIds.length][];

                    for (int i_3 = 0; i_3 < fileIds.length; i_3++) {
                        frameData[i_3] = ANIMATION_FRAMESET_INDEX.getFile(id, fileIds[i_3]);
                    }
                }
            }

            boolean loaded = true;

            for (int i_11 = 0; i_11 < frameData.length; i_11++) {
                byte[] bytes_12 = frameData[i_11];
                Packet buffer = new Packet(bytes_12);
                buffer.index = 1;
                int frameId = buffer.readUnsignedShort();
                synchronized (ANIMATION_FRAME_INDEX) {
                    loaded &= ANIMATION_FRAME_INDEX.loadFile(frameId);
                }
            }

            if (!loaded) {
                return false;
            } else {
                LinkedNodeList frameBaseList = new LinkedNodeList();
                int[] fileIds;
                synchronized (ANIMATION_FRAMESET_INDEX) {
                    int fileCount = ANIMATION_FRAMESET_INDEX.filesCount(id);
                    frames = new AnimationFrame[fileCount];
                    fileIds = ANIMATION_FRAMESET_INDEX.getValidFileIds(id);
                }

                for (int i = 0; i < fileIds.length; i++) {
                    byte[] frameData = this.frameData[i];
                    Packet frameBuffer = new Packet(frameData);
                    frameBuffer.index = 1;
                    int frameId = frameBuffer.readUnsignedShort();
                    AnimationFrameBase frameBase = null;

                    for (AnimationFrameBase iter = (AnimationFrameBase) frameBaseList.getBack(); iter != null; iter = (AnimationFrameBase) frameBaseList.getPrevious()) {
                        if (frameId == iter.id) {
                            frameBase = iter;
                            break;
                        }
                    }

                    if (frameBase == null) {
                        synchronized (ANIMATION_FRAME_INDEX) {
                            frameBase = new AnimationFrameBase(frameId, ANIMATION_FRAME_INDEX.getFile(frameId));
                        }

                        frameBaseList.insertBack(frameBase);
                    }

                    frames[fileIds[i]] = new AnimationFrame(frameData, frameBase);
                }

                frameData = null;
                return true;
            }
        }
    }

}
