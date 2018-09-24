public class cau2 {
    public class PS{
        int up;
        int down;
        
        public PS(int up, int down)
        {
            this.up = up;
            this.down = down;
        }
        
        public PS cong(PS ps)
        {
            int up,down;
            up = ps.up * this.down + ps.down * this.up;
            down = ps.down * this.down;
            PS t = new PS(up,down);
            return t;
        }
        
        public PS tru(PS ps)
        {
            int up,down;
            up = - ps.up * this.down + ps.down * this.up;
            down = ps.down * this.down;
            PS t = new PS(up,down);
            return t;
        }
        
        public PS nhan(PS ps)
        {
            int up,down;
            up = ps.up * this.up;
            down = ps.down * this.down;
            PS t = new PS(up,down);
            return t;
        }
        
        public PS chia(PS ps)
        {
            int up,down;
            up = ps.down * this.up;
            down = ps.up * this.down;
            PS t = new PS(up,down);
            return t;
        }
        
        public boolean equals(PS ps)
        {
            if(this.up*ps.down == this.down*ps.up){
                return true;
            }
            else
                return false;
        }
        
        
    }
}
