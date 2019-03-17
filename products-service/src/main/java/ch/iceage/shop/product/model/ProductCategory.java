package ch.iceage.shop.product.model;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="PRODUCT_CATEGORY")
public class ProductCategory extends AbstractDecodifica {
	
	@ManyToOne(cascade={MERGE, PERSIST, REMOVE})
	@JoinColumn(name="father_category_id")
	private ProductCategory superCategory;
	@OneToMany(mappedBy="superCategory",
			   cascade={MERGE, PERSIST, REMOVE})
	@Fetch(FetchMode.SUBSELECT)
	private List<ProductCategory> childrenCategories;
	
	public ProductCategory() {
		this(null,null,null,null);
	}
	
	public ProductCategory(Integer code, String charCode, String shortDescription, String description) {
		super(code, charCode, shortDescription, description);
		this.superCategory=null;
		this.childrenCategories=new ArrayList<>();
	}

	public ProductCategory getSuperCategory() {
		return superCategory;
	}

	protected void setSuperCategory(ProductCategory superCategory) {
		this.superCategory = superCategory;
	}
	
	public List<ProductCategory> getChildrenCategories() {
		return childrenCategories;
	}

	public void addChild(ProductCategory e) {
		childrenCategories.add(e);
		e.setSuperCategory(this);
	}
	
	public boolean addAsSibling(ProductCategory e) {
		if(this.superCategory!=null) {
			this.superCategory.getChildrenCategories().add(e);
			e.setSuperCategory(this.superCategory);
		}
		return childrenCategories.add(e);
	}

}
