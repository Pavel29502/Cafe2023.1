package com.example.cafe2023.bean;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
    @Entity
    @Table(name = "Preorder")
    public class Preorder {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;
        @OneToOne(mappedBy = "preorderId")
        private Review preorderReview;
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "preorderId")
        private List<PreorderInfo> preorderInfoo;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        private Users userr;
        @Column(name = "preorder_time") // заменю тип немного позже
        private long preorderTime;
        @Column(name = "preorder_sum")
        private long prorderSum;
        @Column(name = "preorder_type")
        private long preorderType;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public Review getPreorderReview() {
            return preorderReview;
        }

        public void setPreorderReview(Review preorderReview) {
            this.preorderReview = preorderReview;
        }

        public List<PreorderInfo> getPreorderInfoo() {
            return preorderInfoo;
        }

        public void setPreorderInfoo(List<PreorderInfo> preorderInfoo) {
            this.preorderInfoo = preorderInfoo;
        }

        public Users getUserr() {
            return userr;
        }

        public void setUserr(Users userr) {
            this.userr = userr;
        }

        public long getPreorderTime() {
            return preorderTime;
        }

        public void setPreorderTime(long preorderTime) {
            this.preorderTime = preorderTime;
        }

        public long getProrderSum() {
            return prorderSum;
        }

        public void setProrderSum(long prorderSum) {
            this.prorderSum = prorderSum;
        }

        public long getPreorderType() {
            return preorderType;
        }

        public void setPreorderType(long preorderType) {
            this.preorderType = preorderType;
        }

        @Override
        public String toString() {
            return "Preorder{" +
                    "id=" + id +
                    ", preorderReview=" + preorderReview +
                    ", preorderInfoo=" + preorderInfoo +
                    ", userr=" + userr +
                    ", preorderTime=" + preorderTime +
                    ", prorderSum=" + prorderSum +
                    ", preorderType=" + preorderType +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Preorder preorder = (Preorder) o;
            return id == preorder.id && preorderTime == preorder.preorderTime && prorderSum == preorder.prorderSum && preorderType == preorder.preorderType && Objects.equals(preorderReview, preorder.preorderReview) && Objects.equals(preorderInfoo, preorder.preorderInfoo) && Objects.equals(userr, preorder.userr);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, preorderReview, preorderInfoo, userr, preorderTime, prorderSum, preorderType);
        }
    }
