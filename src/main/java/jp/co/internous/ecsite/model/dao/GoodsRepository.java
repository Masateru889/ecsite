package jp.co.internous.ecsite.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internous.ecsite.model.enity.Goods;
import jp.co.internous.ecsite.model.enity.User;

public interface GoodsRepository  extends JpaRepository<Goods, Long>{

}
