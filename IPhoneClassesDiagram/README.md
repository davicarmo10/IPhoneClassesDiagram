# IPhoneClassesDiagram
IPhone Classes Diagram

### Summary of the Class Diagram

This class diagram represents an abstraction of an iPhone's functionalities through three main components: **MusicPlayer**, **Telephone**, and **Browser**. These components are represented as superclasses, each with specific attributes and methods. Specialized subclasses—**iTunes**, **Dialer**, and **Safari**—inherit from these superclasses, adding more specific attributes related to their functionalities.

#### Superclasses

1. **MusicPlayer**
   - **Attributes**:
     
   - **Methods**:
     - `playSong()`: Plays a song.
     - `pause()`: Pauses the song.
     - `fowardSong()`: Foward to next song.
     - `previousSong()`: Return to the previous song.
2. **Telephone**
   - **Attributes**:
     
   - **Methods**:
     - `call()`: Make a call.
     - `receiveCall()`: Receive a call.

3. **Browser**
   - **Attributes**:
 
   - **Methods**:
     - `search()`: Search a website.
     
#### Subclasses

1. **iTunes** (inherits from `MusicPlayer`)
   - **Attributes**:
     - `currentSong`: The current song playing or selected.

   - **Methods**:
     - `closeApp()`: Closes the current app.

3. **Telephone** (inherits from `Telephone`)
   - **Attributes**:
     -  `currentCall`: The phone number of the current call.
     -  `recentCalls`: The most recent calls done or received.
   - **Methods**:
     - `closeApp()`: Closes the current app.
       
4. **Safari** (inherits from `Browser`)
   - **Attributes**:
     - `incogniteMode`: Indicates if incognito mode is active.
     - `bookMarks`: the added favorite sites.
     - `extensions`: Installed extensions.
      
   - **Methods**:
     - `closeApp()`: Closes the current app.
       
5. **Iphone Class**
  - **Attributes**:
    - `model`: Indicate the iphone model.
    - `iosVersion`: indicate the system version.

  - **Methods**:
    - `openApp(itunes)`: Open the app ITunes.
    - `openApp(telephone)`: Open the app Telephone.
    - `openApp(safari)`: Open the app Safari.
     
