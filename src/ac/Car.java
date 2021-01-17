package ca;

public class Car {
        //region Instance Variables
        private String _Brand;
        private String _Type;
        private short _Hp;
        private boolean _Rent;
        //endregion

        //region Getter and Setter
        void setRent(boolean rent) {
            _Rent = rent;
        }

        boolean getRent() {
            return _Rent;
        }

        void setHp(short hp) {
            _Hp = hp;
        }
        //endregion

        //region Constructors
        public Car(String brand, String type, short hp) {
            _Brand = brand;
            _Type = type;
            _Hp = hp;
            _Rent = false;
        }
        //endregion

        //region Public Methods
        public String getSpecification() {
            String specification;
            specification = _Brand + ", " + _Type + ", " + _Hp + " PS";
            return specification;
        }
        //endregion

}
