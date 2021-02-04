public Tetrominoe{

        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        int x4;
        int y4;

public void Tetrominoe(int n){
        switch(n){
        case(1): //L-Shape
        x1=0;
        y1=38;
        x2=0;
        y2=39;
        x3=1;
        y3=39;
        x4=2;
        y4=39;
        break;

        case(2): //L-Mirrored_Shape
        x1=0;
        y1=39;
        x2=0;
        y2=38;
        x3=1;
        y3=38;
        x4=2;
        y4=38;
        break;

        case(3): //S-Shape
        x1=0;
        y1=38;
        x2=1;
        y2=38;
        x3=1;
        y3=39;
        x4=2;
        y4=39;
        break;

        case(4): //S-Mirrored-Shape
        x1=0;
        y1=39;
        x2=1;
        y2=39;
        x3=1;
        y3=38;
        x4=2;
        y4=38;
        break;

        case(5): //T-Shape
        x1=0;
        y1=39;
        x2=1;
        y2=39;
        x3=1;
        y3=38;
        x4=2;
        y4=39;
        break;

        case(6):  //Square-Shape
        x1=0;
        y1=39;
        x2=1;
        y2=39;
        x3=0;
        y3=38;
        x4=1;
        y4=38;
        break;

        case(7): //Line-Shape
        x1=0;
        y1=39;
        x2=1;
        y2=39;
        x3=2;
        y3=39;
        x4=3;
        y4=39;
        break;
        }

        }
        }
