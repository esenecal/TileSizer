# TileSizer
 A program to find render tile sizes for a Blender project based on the camera dimensions.

 The concept of the program is simple. Ideally tile sizes for rendering should fit the output resolution (so that there are no partial tiles), be square, and have dimensions that are powers of 2 (see this Stack Exchange post where I got my information: https://blender.stackexchange.com/questions/44428/why-how-does-tile-size-effect-performance#:~:text=Blender%20usually%20has%20a%20harder,its%20tiles%2C%20textures%2C%20etc.) 
 
 To find ideal tile sizes for the dimensions, or resolution, of the camera (for example: 1920 by 1080), the idea behind this program is to find the factors of the dimensions, then locate factors of the dimensions that are the same. For example, if the camera dimensions are 32 by 16:

 Factors of 32: 1, 2, 4, 8, 16, 32
 Factors of 16: 1, 2,    8, 16

 For this resolution, ideal tile sizes would be 1x1, 2x2, 8x8, and 16x16. You could then choose which tile size you wish to use based on your needs (small dimensions for cpu, large for gpu, etc.). Of course, 32x16 is not usually used, and so finding factors of larger numbers can be difficult. Naturally, I'm going to try to make the computer do the math for me.
 
 I would like to point out that I am neither a greatly experienced programmer or CG artist, and am self taught in both endeavors through the internet. My information about what tile sizes and properties work better for Blender may be incorrect, but are based off of what I have learned. So be aware.