public class Minesweeper
{
    public static void main(String[] args)
    {
        int row = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        int mine = Integer.parseInt(args[2]);

        boolean[][] mineMap = new boolean[row+2][col+2];
        int[][] realMap = new int[row+2][col+2];
        boolean[] mineOrder = new boolean[row * col];

        for(int i = 0; i < mineOrder.length; i++)
        {
            if (i < mine) mineOrder[i] = true;
        }

        int n1, n2;
        boolean t1, t2;

        for(int i = 0; i < mineOrder.length; i++)
        {
            n1 = (int) (Math.random() * mineOrder.length);
            t1 = mineOrder[n1];
            n2 = (int) (Math.random() * mineOrder.length);
            t2 = mineOrder[n2];
            mineOrder[n1] = t2;
            mineOrder[n2] = t1;
        }

        int order = 0;
        
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= col; j++)
            {
                mineMap[i][j] = mineOrder[order];
                order++;
            }
        }

        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= col; j++)
            {
                if (mineMap[i][j] == false)
                {
                    if (mineMap[i][j+1] == true) realMap[i][j]++;
                    if (mineMap[i][j-1] == true) realMap[i][j]++;
                    if (mineMap[i-1][j] == true) realMap[i][j]++;
                    if (mineMap[i-1][j+1] == true) realMap[i][j]++;
                    if (mineMap[i-1][j-1] == true) realMap[i][j]++;
                    if (mineMap[i+1][j] == true) realMap[i][j]++;
                    if (mineMap[i+1][j+1] == true) realMap[i][j]++;
                    if (mineMap[i+1][j-1] == true) realMap[i][j]++;
                }
            }
        }
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= col; j++)
            {
                if (mineMap[i][j] == true && j == col) System.out.println("*");
                else if (mineMap[i][j] == true) System.out.print("*  ");
                else if (mineMap[i][j] == false && j == col) System.out.println(realMap[i][j] + "  ");
                else if (mineMap[i][j] == false) System.out.print(realMap[i][j] + "  ");

            }
        }
    }
}
